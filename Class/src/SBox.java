import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SBox implements java.io.Serializable{	//�ν��Ͻ� ����ȭ�� ���� �⺻������
													//Serializable �������̽� ����
	String s;
	public SBox(String s) {
		this.s = s;
	}
	public String get() {
		return s;
	}
	
	public static void main(String[] args) {
		SBox box1 = new SBox("Robot");
		SBox box2 = new SBox("Strawberry");
		
		try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Object.bin"))){
			oo.writeObject(box1);	//box1 �� �����ϴ� �ν��Ͻ� ����
			oo.writeObject(box2);	//box2 �� �����ϴ� �ν��Ͻ� ����
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
