class Product {
	int price; // ��ǰ�� ����

	Product(int price) {
		this.price = price;
	}
}

class TV extends Product {
	TV() {
		super(100);
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(100);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer {

	int money = 1000;
	Product[] cart = new Product[3]; // �� �ǹ̸� �𸣰ڳ�
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ׺���" + p);
			return;
		}
		// �������� ����ϴٸ� ��ǰ�� ������ ���������� ����
		money -= p.price;
		// add() ��ٱ��Ͽ� ������ ������ ��� �޼��� ȣ��
		add(p);
	}
	void add(Product p) {
		// īƮ�� ��á��.
		if (i >= cart.length) {
			// ������ ��ٱ��Ϻ��� ū ���ο� �迭�� �����Ѵ�.
			Product[] tmp = new Product[cart.length * 2];
			// ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			// ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�.
			cart = tmp;
		}
		cart[i++] = p;
	}

	void summary() {
		// ������� ��� ���� ��
		String itemList = " ";
		int sum = 0;

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			// ��ü + ���ڿ� �ص� cart[i]�� ���ڿ��̱� ������ toString ȣ���ؼ� itemList �� ���� ��.
			// cart[i].toString �̶�� �ص� ��.
			itemList += cart[i] + ",";

			sum += cart[i].price;
		}
		System.out.println("������ ���� : "+itemList);
		System.out.println("����� �ݾ� : "+sum);
		System.out.println("���� �ݾ� : "+money);
	}
}


