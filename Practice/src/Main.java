import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		writeScores();
		
	}
			
		
	public static void writeScores() {
		Scanner scanner = new Scanner(System.in);
		PrintWriter file = null;
		
		
		try {
			file = new PrintWriter("scores.csv");				//�������� �� �� �ִ� ����
			file.println("�̸�, ����, ����, ����, ����, ����");
			
			while(true) {
				
				System.out.print("�̸� : ");
				String name = scanner.next();
				
				System.out.print("���� : ");
				int korean = scanner.nextInt();
				
				System.out.print("���� : ");
				int math = scanner.nextInt();
				
				System.out.print("���� : ");
				int english = scanner.nextInt();
				
				//�����ϴ� �ڵ�
				file.format("%s, %d, %d, %d, %d, %d\n",  name, korean, math, english, 0, 0);
				
				System.out.print("�ߴ��� q, ��� �Է��� �ƹ�Ű�� �����ּ���.");
				String key = scanner.next();
				
				// �б��ϴ� �ڵ�
				if ("q".equalsIgnoreCase(key)){					//key.equalsIgnoreCase("q") �̰Ŷ� ������ ,������ ���°� �� ������.0
					break;
				}
				
				
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}finally {
			System.out.println("���� �Է��� �Ϸ��մϴ�.");
			
			scanner.close();
			try {
				if (file != null) {
					file.flush();	//���ۿ� ���� �����͸� ���Ͽ� ����
					file.close();
				}
			
		}finally {
		}
		}
	}

	
}

		
		
		
		
		
		
		
		
		
		

