
//MS ���� �����ϴ� �������̽� .�߻�޼ҵ常 ����
interface Printable {
	public void print(String doc);
}

//�Ｚ ������. �ڽ��� ���γ��� ������
class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

//LG ������.  �ڽ��� ���γ��� ������
class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

public class InterfaceTest {

	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		// �Ｚ �����ͷ� ���
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG �����ͷ� ���
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
