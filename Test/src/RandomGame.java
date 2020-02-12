import java.util.InputMismatchException;
import java.util.Scanner;

interface IRandomNum {
	void correctNum();
}

class RandomNum implements IRandomNum {
	@Override
	public void correctNum() {
		// 생성된 랜덤숫자 넣는곳. 1부터 100까지 범위
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("컴퓨터가 정한 숫자 : " + answer);

		int input = 0; // 사용자가 입력할 숫자 넣는곳
		int count = 0; // 시도횟수

		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다.다시 입력하세요");
				continue; // 처음으로 돌아간다.
			}

			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는" + count + "번 입니다");
				break;
			}

		} while (true);
		
	}
}

public class RandomGame {

	public static void main(String[] args) {

		IRandomNum game = new RandomNum();
		game.correctNum();
	}

}
