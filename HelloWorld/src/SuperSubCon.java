
class SuperCLS {
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}

class SubCLS extends SuperCLS {
	public SubCLS() {			//ȣ���� ���� Ŭ������ �����ڸ� ������� ������
								//void ������ ȣ���.
		System.out.println("I'm Sub Class");
	}
}

public class SuperSubCon {

	public static void main(String[] args) {
		new SubCLS();		//���� Ŭ������ ������ ������
							//���� Ŭ������ ������ �����.
	}

}
