import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("������ �Է� ( 0 �Է½� ���� ) >> ");
			int num = sc.nextInt();

			if (num == 0)
				break;

			vector.add(num); // num ���� vector �ȿ� ��� ���δ�.

			int avg = 0;

			for (int i = 0; i < vector.size(); i++) {
				System.out.print(vector.get(i) + " ");
				avg = avg + vector.get(i); // �ϴ� avg �ȿ� ���� �־����
			}

			System.out.println();
			avg = avg / vector.size(); // ���Ⱑ ��¥ ���

			System.out.println("���� ���  " + avg);

		}

		System.out.println("���α׷� �����Դϴ�.");
		sc.close();
	}

}
