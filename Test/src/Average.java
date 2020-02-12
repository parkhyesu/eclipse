import java.util.ArrayList;
import java.util.Scanner;

interface Totalable {
	public abstract void printAVG();
}

class TotalAVG implements Totalable {

	@Override
	public void printAVG() {
		ArrayList<Character> stack = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("6���� ������ ��ĭ���� �и� �Է� >>");

		// �Է¹޾Ƽ� ArrayList �ȿ� �ִ°�.
		for (int i = 0; i < 6; i++) {
			char c = sc.next().charAt(0);
			stack.add(c);
		}
		// �������
		int sum = 0;

		for (int i = 0; i < stack.size(); i++) {

			char c = stack.get(i); // ������ c �� �ֱ�

			switch (c) {
			case 'A':
				sum = sum + 4;
				break;
			case 'B':
				sum = sum + 3;
				break;
			case 'C':
				sum = sum + 2;
				break;
			case 'D':
				sum = sum + 1;
				break;
			case 'F':
				sum = sum + 0;
				break;
			}
		}

		double avr = (double) sum / stack.size();
		System.out.println(avr);

		sc.close();
	}
}
public class Average {

	public static void main(String[] args) {
		Totalable total = new TotalAVG();
		total.printAVG();
	}

}
