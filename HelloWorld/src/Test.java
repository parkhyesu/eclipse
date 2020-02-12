
public class Test {

	public static void main(String[] args) {
		int kor = 60;
		int math = 70;
		int eng = 100;

		int total = kor + math + eng;
		double avg = total / 3.0; // int 나누기 int 한거니까 소수점 표현 위해서//(double) total / 3 해도됨.
		char grade;

		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("평점 : " + grade);

	}

}
