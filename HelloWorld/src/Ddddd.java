
public class Ddddd {

	public static void main(String[] args) {

		// ¦���ܸ� ��������
		for (int i = 2; i < 9; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "x" + j + " = " + (i * j));
				}
			}
		}

		for (int i = 1; i < 10; i++) {

			if (i % 2 == 1)
				continue;
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + " = " + (i * j));
			}
		}
		
		for (int i = 1; i < 10; i++) {
			for(int j= 1; j < 10; j++) {
				if( i % 2 == 1)
					break;
				System.out.println(i + "x" + j + " = " + (i * j));
			}
		}
		

		// 9�ܺ��� 1�ܱ��� ��������
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + " = " + (i * j));
			}
		}

		// ������� Ȧ���� �����ܸ� ��������
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 != 0) {
					System.out.println(i + "x" + j + " = " + (i * j));
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
