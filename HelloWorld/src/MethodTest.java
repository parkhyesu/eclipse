
public class MethodTest {

	public static void main(String[] args) {

		// 원넓이
		double circle;
		double radius = 10;

		circle = circleArea(radius);
		System.out.println(circle);

		// 삼각형 넓이
		double triangle;

		triangle = triArea(10, 1.5);
		System.out.println(triangle);

		// 합
		System.out.println(pulsOdd());

	}

	// 파라미터를 하나 받아 원의 넓이를 구하는 함수를 만드시오
	public static double circleArea(double r) {
		final double PI = 3.14;
		return r * r * PI;
	}

	// 가로 세로를 받아 삼각형의 넓이를 구하는 수를 만드시오
	public static double triArea(double height, double width) {
		return (height * width) / 2;
	}

	// 1부터 100까지의 수 중 홀수의 합을 구하는 함수를 만드시오
	public static int pulsOdd() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				sum = sum + i;
		}
		return sum;
	}

}
