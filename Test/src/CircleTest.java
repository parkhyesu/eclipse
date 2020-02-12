import java.util.Scanner;

class Circle {

	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {		//�� �־��ִ� ���� �ϴ� ������.
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);	//��»��� 
	}
	
}

public class CircleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle[] circle = new Circle[3];		// Circle �迭 ��ü 3�� ����// 
												//[4] �� �ϸ� x, y, radius �Է��� 4�� ����.
		for(int i = 0; i < circle.length; i++) {
			System.out.print("x, y, radius >> ");	//println ���� print�� �ؾ���.
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			circle[i] = new Circle(x, y, radius);		//��������� ���� �Է¹޴°ͱ��� ��������
		}
		
		for(Circle c : circle) {
			c.show();							//���
		}
	}

}
