class GArray<T> {

	private T[] arr;

	public void setArr(T[] arr) {// 셋팅해주기
		this.arr = arr;
	}

	public void printArr() { // 세팅된거 for 문으로
		for (T str : arr) {
			System.out.println(str);
		}
	}
}
public class GenericTest {

	public static void main(String[] args) {

		GArray<String> gt = new GArray<String>();

		String[] ss = { "바나나", "우유", "스택", "오렌지", "아아" };
		gt.setArr(ss); // 배열을 넣게되면
		gt.printArr(); // 출력되게
	}
}
