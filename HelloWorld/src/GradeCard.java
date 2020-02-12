import java.util.Scanner;

class Grade {

	int math;
	int science;
	int english;

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	double average() {					//파라미터는 필요 없고 리턴값은 반드시 있어야함.
		return (double) (math + science + english) / 3;
	}
}

public class GradeCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수학 ,과학, 영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은" + me.average());
	}

}
