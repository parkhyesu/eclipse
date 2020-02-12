package java_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//서버
public class MakeServerSocket {
	//소켓쓰려고
	ServerSocket serverSocket = null;
	Socket socket = null;
	
	//문자열 다루려고
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;
	
	public MakeServerSocket() {
		
		try {
			//2000 : 포트번호?
			serverSocket = new ServerSocket(2000);
			
			//무한루프. 이게 '기다린다' 를 코드로 표현한 것
			while(true) {
				//기다리는 부분. 클라이언트가 접속할때까지
				socket = serverSocket.accept();
				System.out.println("Client 요청됨");
				
				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//여기도 기다리는 부분..
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
