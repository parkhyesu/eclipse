
public class Method {

	public static void main(String[] args) {
		double myHeight = 175.9;
		System.out.println("���α׷��� ����");
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();
		System.out.println("���α׷� ��");

		int result;
		result = adder(4, 5);
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));

	}

	public static void hiEveryone(int age, double height) {

		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���� Ű��" + height + "cm �Դϴ�.");

	}

	public static void byEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}

	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}

	public static double square(double num) {
		return num * num;
	}

}
