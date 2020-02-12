
public class Methodtest2 {

	public static void main(String[] args) {

		printGuGu(5,2);
	}

	// 인자 받아서 별 출력하기
	public static void stars(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

	// 선생님 코드
	public static void printStar(int end) {
		for (int i = 1; i <= end; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	// 선생님 코드/ start랑 end 의 값을 바꾼다. 스왑
	public static void printGuGu(int start, int end) {

		int temp;

		if (start > end) {
			temp = start;
			start = end;
			end = temp; // 이러면 두 수가 swap 되어서 나온다.
		}

		for (int i = start; i <= end; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

	}

	// 인자 두개 받아서 구구단 출력하기, ex) 2,5 받으면 2단에서 5단까지 5,2 받으면 2단에서 5단까지
	public static void multiplication(int a, int b) {
		if (a >= b) {
			for (int i = b; i <= a; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				} 
			}
		} else {
			for (int i = a; i <= b; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}
			}

		}

	}
}
