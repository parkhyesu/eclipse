interface IArea {
	public abstract double area(); // ���� ���ڰ� ������ �ؿ��� ���ڸ� ������.
}

class Square implements IArea {
	double height;
	double width;

	Square(double height, double width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double area() {
		return height * width;
	}
}
class Triangle implements IArea {
	double height;
	double width;

	Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width / 2;
	}
}

public class TestArea {
	public static void main(String[] args) {

		IArea area = new Square(10, 20);
		System.out.println(area.area()); // ���⼭ ��½�Ű�� ��.
		System.out.println();

		area = new Triangle(10, 20);
		System.out.println(area.area());
		System.out.println();

	}

}
