
class CircleArea {

	double radius;

	CircleArea(double radius) {

		if (radius < 0) {
			System.out.println("������ �ȵȴ�.");
		}
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}

public class CircleAreaTest {

	public static void main(String[] args) {

		CircleArea circleArea = new CircleArea(-10);
		System.out.println(circleArea.getArea());

	}

}
