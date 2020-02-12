package java_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//����
public class MakeServerSocket {
	//���Ͼ�����
	ServerSocket serverSocket = null;
	Socket socket = null;
	
	//���ڿ� �ٷ����
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;
	
	public MakeServerSocket() {
		
		try {
			//2000 : ��Ʈ��ȣ?
			serverSocket = new ServerSocket(2000);
			
			//���ѷ���. �̰� '��ٸ���' �� �ڵ�� ǥ���� ��
			while(true) {
				//��ٸ��� �κ�. Ŭ���̾�Ʈ�� �����Ҷ�����
				socket = serverSocket.accept();
				System.out.println("Client ��û��");
				
				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//���⵵ ��ٸ��� �κ�..
				while((lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}
				
				writer.close();
				reader.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	
	public static void main(String[] args) {
		new MakeServerSocket();
	}
}
