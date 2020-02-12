import java.util.Scanner;

class MyMath {

	public static int myMin(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int num : arr) {
			if (min > num) {
				min = num;
			}
		}

		return min;
	}

}

public class MyMathTest {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(MyMath.myMin(arr));
	}

}
