class Product {
	int price; // 제품의 가격

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
	Product[] cart = new Product[3]; // 이 의미를 모르겠네
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액부족" + p);
			return;
		}
		// 가진돈이 충분하다면 제품의 가격을 가진돈에서 빼고
		money -= p.price;
		// add() 장바구니에 구입한 물건을 담는 메서드 호출
		add(p);
	}
	void add(Product p) {
		// 카트가 꽉찼다.
		if (i >= cart.length) {
			// 기존의 장바구니보다 큰 새로운 배열을 생성한다.
			Product[] tmp = new Product[cart.length * 2];
			// 기존의 장바구니의 내용을 새로운 배열에 복사한다
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			// 새로운 장바구니와 기존의 장바구니를 바꾼다.
			cart = tmp;
		}
		cart[i++] = p;
	}

	void summary() {
		// 뭐샀는지 담기 위한 것
		String itemList = " ";
		int sum = 0;

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			// 객체 + 문자열 해도 cart[i]가 문자열이기 때문에 toString 호출해서 itemList 에 담기는 것.
			// cart[i].toString 이라고 해도 됨.
			itemList += cart[i] + ",";

			sum += cart[i].price;
		}
		System.out.println("구입한 물건 : "+itemList);
		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : "+money);
	}
}


