
class SuperCLS {
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}

class SubCLS extends SuperCLS {
	public SubCLS() {			//호출할 상위 클래스의 생성자를 명시하지 않으면
								//void 생성자 호출됨.
		System.out.println("I'm Sub Class");
	}
}

public class SuperSubCon {

	public static void main(String[] args) {
		new SubCLS();		//상위 클래스의 생성자 실행후
							//하위 클래스의 생성자 실행됨.
	}

}
