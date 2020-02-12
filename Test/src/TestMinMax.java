
interface IMaxMin {
	double max(double arr[]);

	double min(double arr[]);
}

class MinMax implements IMaxMin {

	public double max(double arr[]) {
		double max = arr[0];

		for (double num : arr) {
			if (max < num) {
				max = num;
			}
		}
		return max;
	}

	public double min(double arr[]) {
		double min = arr[0];

		for (double num : arr) {
			if (min > num) {
				min = num;
			}
		}
		return min;
	}
}

public class TestMinMax {

	public static void main(String[] args) {

		double arr[] = {4.5, 8.7, 1.9, 2.9, 9.8};
		IMaxMin maxMin = new MinMax();
		
		System.out.println(maxMin.min(arr));
		System.out.println(maxMin.max(arr));
	}

}
