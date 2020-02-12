interface IArea {
	public abstract double area(); // 여기 인자가 없으면 밑에도 인자를 못받음.
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
		System.out.println(area.area()); // 여기서 출력시키면 됨.
		System.out.println();

		area = new Triangle(10, 20);
		System.out.println(area.area());
		System.out.println();

	}

}
