class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size; // �ܺο��� ȣ���ϰ� �Ǹ� size �� ��ԵǴ� �޼ҵ�
	}
}

//===========================================================================
class ColorTV extends TV {

	private int color;

	public ColorTV(int size, int color) {

		// size �� �޾Ƽ� �θ� Ŭ������ �ִ� size �� ���� �־������. �θ��� ������ ȣ��.
		super(size);
		this.color = color;

	}

	int getColor() {
		return color;
	}

	void printProperty() {

		// size �̾Ƴ��� color �̾Ƴ�����
		// super.size �� ������ �������� ���� : private �� �޼ҵ�� �����ؾ���
		// super.getSize(), getSize() �����ϳ� ���� ��.
		// getColor() �� �ǰ� private �� ���� Ŭ�����̱⶧���� �׳� color �� ����.
		System.out.println(getSize() + " ��ġ  " + color + " �÷�");
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
		System.out.print("���� IPTV�� " + address + " �ּ��� ");
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
