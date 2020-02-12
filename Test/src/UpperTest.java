import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class UpperTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���� : ");
		String src = sc.nextLine();
		System.out.println("�纻 �̸� : ");
		String dst = sc.nextLine();
		
		
		try(BufferedReader in = new BufferedReader(new FileReader(src));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst))){
			
			int data;
			while((data = in.read()) != -1) {
				if(data >= 97 && data <= 122) {		//��״� �ҹ��� �ֵ� �ƽ�Ű�ڵ�
					out.write((char)(data - 32));	//���� ���ڸ� ���� ��� ��Ʈ���� ��
					System.out.print((char)(data - 32));//32 ���� ������ �빮�� �ƽ�Ű�ڵ�
				}else {
					out.write(data);
					System.out.print((char)(data));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
