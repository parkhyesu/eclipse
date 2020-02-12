import java.util.Scanner;

class Circle {

	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {		//값 넣어주는 역할 하는 생성자.
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);	//출력상태 
	}
	
}

public class CircleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle[] circle = new Circle[3];		// Circle 배열 객체 3개 생성// 
												//[4] 로 하면 x, y, radius 입력줄 4개 나옴.
		for(int i = 0; i < circle.length; i++) {
			System.out.print("x, y, radius >> ");	//println 말고 print로 해야함.
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			circle[i] = new Circle(x, y, radius);		//여기까지는 이제 입력받는것까지 끝낸상태
		}
		
		for(Circle c : circle) {
			c.show();							//출력
		}
	}

}
