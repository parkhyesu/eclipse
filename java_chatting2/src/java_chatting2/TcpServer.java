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
			// 상대방과의 통로 부분
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (Exception e) {

		}
	}
	// 쓰레드로 처리해야 할 부분 //글자 처리하는 부분
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
			System.out.println("서버가 준비되었습니다");

			socket = serverSocket.accept();

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start(); // 치는 부분
			receiver.start(); // 받아오는 부분

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
