
public class Ddddd {

	public static void main(String[] args) {

		// 짝수단만 찍으세요
		for (int i = 2; i < 9; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "x" + j + " = " + (i * j));
				}
			}
		}

		for (int i = 1; i < 10; i++) {

			if (i % 2 == 1)
				continue;
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + " = " + (i * j));
			}
		}
		
		for (int i = 1; i < 10; i++) {
			for(int j= 1; j < 10; j++) {
				if( i % 2 == 1)
					break;
				System.out.println(i + "x" + j + " = " + (i * j));
			}
		}
		

		// 9단부터 1단까지 찍으세요
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + " = " + (i * j));
			}
		}

		// 결과값이 홀수인 구구단만 찍으세요
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 != 0) {
					System.out.println(i + "x" + j + " = " + (i * j));
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
