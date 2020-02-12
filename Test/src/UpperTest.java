import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class UpperTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("대상 파일 : ");
		String src = sc.nextLine();
		System.out.println("사본 이름 : ");
		String dst = sc.nextLine();
		
		
		try(BufferedReader in = new BufferedReader(new FileReader(src));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst))){
			
			int data;
			while((data = in.read()) != -1) {
				if(data >= 97 && data <= 122) {		//얘네는 소문자 애들 아스키코드
					out.write((char)(data - 32));	//읽은 문자를 버퍼 출력 스트림에 씀
					System.out.print((char)(data - 32));//32 빼면 각각의 대문자 아스키코드
				}else {
					out.write(data);
					System.out.print((char)(data));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
