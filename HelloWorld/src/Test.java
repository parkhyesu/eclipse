
public class Test {

	public static void main(String[] args) {
		int kor = 60;
		int math = 70;
		int eng = 100;

		int total = kor + math + eng;
		double avg = total / 3.0; // int ������ int �ѰŴϱ� �Ҽ��� ǥ�� ���ؼ�//(double) total / 3 �ص���.
		char grade;

		if (avg >= 90) {
			grade = '��';
		} else if (avg >= 80) {
			grade = '��';
		} else if (avg >= 70) {
			grade = '��';
		} else if (avg >= 60) {
			grade = '��';
		} else {
			grade = '��';
		}

		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + grade);

	}

}
