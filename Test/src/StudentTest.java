import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
	private String name;
	private String dept;
	private String number;
	private double grade;
	
	public Student(String name, String dept, String number, double grade){
		this.name = name;
		this.dept = dept;
		this.number = number;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getnumber() {
		return number;
	}
	public void setStudentNumber(String number) {
		this.number = number;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		//���� �ǵ� �����?
		List<Student> studentList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		
		
		//������ 4�� �ֱ�
		for(int i = 0; i < 4; i++) {
			System.out.print(">>  ");
			String line = sc.nextLine();	//���� ��ü�� �Ѳ����� �Է¹ޱ�
			
			//�Ѳ����� ���� �͵� ���ε��� �߶󳻱�
			StringTokenizer st = new StringTokenizer(line, ",");
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String number = st.nextToken().trim();
			Double grade = Double.parseDouble(st.nextToken().trim());
			//�߶󳻸� string ���¶� double �� ����ȯ ��������ؼ� ����.
			
			studentList.add(new Student(name,dept,number,grade));	
			
		}
		
		for(Student student : studentList) {
			System.out.println("------------------------------");
			System.out.println(student.getName());
			System.out.println(student.getDept());
			System.out.println(student.getnumber());
			System.out.println(student.getGrade());
		}
		
		
		
	}

}
