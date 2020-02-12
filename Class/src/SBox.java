import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SBox implements java.io.Serializable{	//인스턴스 직렬화를 위한 기본조건인
													//Serializable 인터페이스 구현
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
			oo.writeObject(box1);	//box1 이 참조하는 인스턴스 저장
			oo.writeObject(box2);	//box2 가 참조하는 인스턴스 저장
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
