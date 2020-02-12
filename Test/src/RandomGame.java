import java.util.InputMismatchException;
import java.util.Scanner;

interface IRandomNum {
	void correctNum();
}

class RandomNum implements IRandomNum {
	@Override
	public void correctNum() {
		// ������ �������� �ִ°�. 1���� 100���� ����
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("��ǻ�Ͱ� ���� ���� : " + answer);

		int input = 0; // ����ڰ� �Է��� ���� �ִ°�
		int count = 0; // �õ�Ƚ��

		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ���");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("��ȿ���� ���� ���Դϴ�.�ٽ� �Է��ϼ���");
				continue; // ó������ ���ư���.
			}

			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ����" + count + "�� �Դϴ�");
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
