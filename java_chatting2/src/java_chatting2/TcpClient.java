package java_chatting2;

import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		
		try {
			
			String serverIp = "192.168.6.18";
			
			//������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverIp, 2000);
			
			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
	
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
