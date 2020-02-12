import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PlusFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 읽는 거 2개, 쓰는거 1개
		try (BufferedReader f1 = new BufferedReader(new FileReader(sc.next("a.txt")));
				BufferedReader f2 = new BufferedReader(new FileReader(sc.next("b.txt")));
				BufferedWriter f3 = new BufferedWriter(new FileWriter(sc.next("c.txt")))) {

			int data;
			// f1 을 읽어서 계속 쓰기
			while ((data = f1.read()) != -1) {
				f3.write(data);
			}
			// f2 를 읽어서 계속 쓰기
			while ((data = f2.read()) != -1) {
				f3.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
