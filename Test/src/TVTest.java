class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size; // 외부에서 호출하게 되면 size 를 얻게되는 메소드
	}
}

//===========================================================================
class ColorTV extends TV {

	private int color;

	public ColorTV(int size, int color) {

		// size 를 받아서 부모 클래스에 있는 size 에 값을 넣어줘야함. 부모의 생성자 호출.
		super(size);
		this.color = color;

	}

	int getColor() {
		return color;
	}

	void printProperty() {

		// size 뽑아내고 color 뽑아내야함
		// super.size 를 넣으면 에러나는 이유 : private 라서 메소드로 접근해야함
		// super.getSize(), getSize() 둘중하나 쓰면 됨.
		// getColor() 도 되고 private 라도 같은 클래스이기때문에 그냥 color 도 가능.
		System.out.println(getSize() + " 인치  " + color + " 컬러");
	}
}
//=================================================================================

class IPTV extends ColorTV {

	private String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	public void printProperty() {
		System.out.print("나의 IPTV는 " + address + " 주소의 ");
		super.printProperty();
	}
}

public class TVTest {

	public static void main(String[] args) {

		//ColorTV myTV = new ColorTV(32, 1024);
		//myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();

	}
}
