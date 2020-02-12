package java_inet;

import java.net.InetAddress;
import java.util.Scanner;

class InetAddressEx {

	Scanner scanner;

	public InetAddressEx() {
		System.out.println("Host �̸��� �Է��ϼ���");

		scanner = new Scanner(System.in);

		try {
			//InetAddress ��ü �������� ���. new ���ϰ� �̷���.
			InetAddress inetAddress = InetAddress.getLocalHost();

			System.out.println("Computer NAME : " + inetAddress.getHostName());
			System.out.println("Computer IP : " + inetAddress.getHostAddress());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class InetTest {

	public static void main(String[] args) {

		new InetAddressEx();
	}

}
