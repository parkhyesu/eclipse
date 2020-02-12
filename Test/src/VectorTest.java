import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("강수량 입력 ( 0 입력시 종료 ) >> ");
			int num = sc.nextInt();

			if (num == 0)
				break;

			vector.add(num); // num 값이 vector 안에 계속 쌓인다.

			int avg = 0;

			for (int i = 0; i < vector.size(); i++) {
				System.out.print(vector.get(i) + " ");
				avg = avg + vector.get(i); // 일단 avg 안에 총합 넣어놓기
			}

			System.out.println();
			avg = avg / vector.size(); // 여기가 진짜 평균

			System.out.println("현재 평균  " + avg);

		}

		System.out.println("프로그램 종료입니다.");
		sc.close();
	}

}
