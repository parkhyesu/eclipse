import java.util.Scanner;
import java.util.Vector;

public class Exercise13_8 {

	Vector words = new Vector();
	String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };

	int interval = 2 * 1000; // 2��
	WordGenerator wg = new WordGenerator();

	public static void main(String[] args) {
		Exercise13_8 game = new Exercise13_8();
		game.wg.start();
		Vector words = game.words;

		while (true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);

			if (index != -1) {
				words.remove(index);
			}
		}
	}

	class WordGenerator extends Thread {
		public void run() {
			while (true) {
				// interval(2��) ���� �迭 data �� �� �� �ϳ��� ���Ƿ� �����ؼ�
				int rand = (int) (Math.random() * data.length);
				//words �� �����Ѵ�.
				words.add(data[rand]);

				try {
					Thread.sleep(interval);
				} catch (Exception e) {

				}
			}
		}
	}
}


