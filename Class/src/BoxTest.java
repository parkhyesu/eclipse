class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an orange";
	}
}

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}


public class BoxTest {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();	//���� ����. Ÿ���� ���̷�Ʈ��
		Box<Orange> oBox = new Box<Orange>();	//���� ����. Ÿ���� ���̷�Ʈ��
		
		aBox.set(new Apple());	//���ڿ� ��ƹ���
		oBox.set(new Orange());	//���ڿ� ��ƹ���
		
		Apple ap = aBox.get();	//����� �����µ� �� ��ȯ ���� �ʴ´�.
		Orange og = oBox.get();	// �������� �����µ� �� ��ȯ ���� �ʴ´�.

		System.out.println(ap);
		System.out.println(og);
	}
}
