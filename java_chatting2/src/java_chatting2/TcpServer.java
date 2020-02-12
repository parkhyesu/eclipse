package java_chatting2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;

	Sender(Socket socket) {
		this.socket = socket;
		try {
			// ������� ��� �κ�
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (Exception e) {

		}
	}
	// ������� ó���ؾ� �� �κ� //���� ó���ϴ� �κ�
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (out != null) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (IOException e) {
				
			}
		}
	}// run
}
class Receiver extends Thread {

	Socket socket;
	DataInputStream in;
	
	Receiver(Socket socket){
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			
		}
	}
	
	@Override
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				
			}
		}
	}//run	
}

public class TcpServer {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

			serverSocket = new ServerSocket(2000);
			System.out.println("������ �غ�Ǿ����ϴ�");

			socket = serverSocket.accept();

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start(); // ġ�� �κ�
			receiver.start(); // �޾ƿ��� �κ�

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
