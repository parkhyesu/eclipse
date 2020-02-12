package java_inet;

import java.net.InetAddress;
import java.util.Scanner;

class InetAddressEx {

	Scanner scanner;

	public InetAddressEx() {
		System.out.println("Host 이름을 입력하세요");

		scanner = new Scanner(System.in);

		try {
			//InetAddress 객체 가져오는 방법. new 안하고 이렇게.
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
