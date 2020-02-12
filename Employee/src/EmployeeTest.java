class Employee {

	private String name;
	private int age;
	private String address;
	private String department;
	private int salary;

	public Employee(String name, int age, String address, String department, int salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
		this.salary = salary;
	}

	void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(department);
		System.out.println(salary);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e = new Employee("박", 18, "박박", "박박ㅂ가", 30);
		e.printInfo();
	}

}
