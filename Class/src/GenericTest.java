class GArray<T> {

	private T[] arr;

	public void setArr(T[] arr) {// �������ֱ�
		this.arr = arr;
	}

	public void printArr() { // ���õȰ� for ������
		for (T str : arr) {
			System.out.println(str);
		}
	}
}
public class GenericTest {

	public static void main(String[] args) {

		GArray<String> gt = new GArray<String>();

		String[] ss = { "�ٳ���", "����", "����", "������", "�ƾ�" };
		gt.setArr(ss); // �迭�� �ְԵǸ�
		gt.printArr(); // ��µǰ�
	}
}
