
class TV {

	String brand;
	int year;
	int inch;

	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(brand + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
}

public class TVTest {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
