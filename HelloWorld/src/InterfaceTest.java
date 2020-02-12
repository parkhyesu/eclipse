
//MS 에서 제공하는 인터페이스 .추상메소드만 제공
interface Printable {
	public void print(String doc);
}

//삼성 프린터. 자식이 세부내용 구현해
class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

//LG 프린터.  자식이 세부내용 구현해
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

		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
