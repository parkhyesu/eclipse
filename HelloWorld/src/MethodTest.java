
public class MethodTest {

	public static void main(String[] args) {

		// ������
		double circle;
		double radius = 10;

		circle = circleArea(radius);
		System.out.println(circle);

		// �ﰢ�� ����
		double triangle;

		triangle = triArea(10, 1.5);
		System.out.println(triangle);

		// ��
		System.out.println(pulsOdd());

	}

	// �Ķ���͸� �ϳ� �޾� ���� ���̸� ���ϴ� �Լ��� ����ÿ�
	public static double circleArea(double r) {
		final double PI = 3.14;
		return r * r * PI;
	}

	// ���� ���θ� �޾� �ﰢ���� ���̸� ���ϴ� ���� ����ÿ�
	public static double triArea(double height, double width) {
		return (height * width) / 2;
	}

	// 1���� 100������ �� �� Ȧ���� ���� ���ϴ� �Լ��� ����ÿ�
	public static int pulsOdd() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				sum = sum + i;
		}
		return sum;
	}

}
