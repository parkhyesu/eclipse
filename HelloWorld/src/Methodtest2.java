
public class Methodtest2 {

	public static void main(String[] args) {

		printGuGu(5,2);
	}

	// ���� �޾Ƽ� �� ����ϱ�
	public static void stars(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

	// ������ �ڵ�
	public static void printStar(int end) {
		for (int i = 1; i <= end; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	// ������ �ڵ�/ start�� end �� ���� �ٲ۴�. ����
	public static void printGuGu(int start, int end) {

		int temp;

		if (start > end) {
			temp = start;
			start = end;
			end = temp; // �̷��� �� ���� swap �Ǿ ���´�.
		}

		for (int i = start; i <= end; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

	}

	// ���� �ΰ� �޾Ƽ� ������ ����ϱ�, ex) 2,5 ������ 2�ܿ��� 5�ܱ��� 5,2 ������ 2�ܿ��� 5�ܱ���
	public static void multiplication(int a, int b) {
		if (a >= b) {
			for (int i = b; i <= a; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				} 
			}
		} else {
			for (int i = a; i <= b; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
			}

		}

	}
}
