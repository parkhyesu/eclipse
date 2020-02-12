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
		//여기 의도 뭐라고?
		List<Student> studentList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		
		//데이터 4번 넣기
		for(int i = 0; i < 4; i++) {
			System.out.print(">>  ");
			String line = sc.nextLine();	//한줄 전체를 한꺼번에 입력받기
			
			//한꺼번에 들어온 것들 따로따로 잘라내기
			StringTokenizer st = new StringTokenizer(line, ",");
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String number = st.nextToken().trim();
			Double grade = Double.parseDouble(st.nextToken().trim());
			//잘라내면 string 형태라서 double 로 형변환 시켜줘야해서 해줌.
			
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
