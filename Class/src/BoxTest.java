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
		Box<Apple> aBox = new Box<Apple>();	//상자 생성. 타입을 다이렉트로
		Box<Orange> oBox = new Box<Orange>();	//상자 생성. 타입을 다이렉트로
		
		aBox.set(new Apple());	//문자열 담아버림
		oBox.set(new Orange());	//문자열 담아버림
		
		Apple ap = aBox.get();	//사과를 꺼내는데 형 변환 하지 않는다.
		Orange og = oBox.get();	// 오렌지를 꺼내는데 형 변환 하지 않는다.

		System.out.println(ap);
		System.out.println(og);
	}
}
