import java.util.HashMap;
import java.util.Scanner;

public class HashTest {

	public static void main(String[] args) {
		
		// Key ���� ���� �̸��� �Ǵ� ��.
		HashMap<String, Integer> nations = new HashMap<>();
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (�� : Korea 5000)");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �̸�, �α� >> ");
			String nation = scanner.next();
			
			if(nation.equals("�׸�"))
				break;				//�׸��̸� while ���� ����������
			
			int population = scanner.nextInt();	//�׸� �� �ƴϸ� ����οͼ�
			
			nations.put(nation, population);	//�Է¹��� �͵� ����.
		}
		
		while(true) {
			System.out.println("�α� �˻� >> ");
			String nation = scanner.next();
			
			if(nation.equals("�׸�"))
				break;
			
			Integer n = nations.get(nation);
			
			if(n == null)
				System.out.println(nation + "����� �����ϴ�.");
			else
				System.out.println(nation + "�� �α��� " + n);
		}
		
		System.out.println("���α׷� �����Դϴ�.");
		scanner.close();
	}

}
