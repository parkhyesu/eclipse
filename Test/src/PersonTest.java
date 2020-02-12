class Person {

	String name;
	String number;

	public Person(String name, String number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person)obj;		//����ȯ ���ֱ�
		
		if(name.equals(person.name) && number.equals(person.number))
			return true;
		else
			return false;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", "12345678");
		Person p2 = new Person("ȫ�浿", "12345678");
		Person p3 = new Person("ȫ���", "12345678");

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}

}
