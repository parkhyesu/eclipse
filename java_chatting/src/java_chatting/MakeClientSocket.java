package java_chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//클라이언트
public class MakeClientSocket {
	//Server가 아니기때문에 기다릴 필요가 없어서 ServerSocket 은 필요 없음
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;

	MakeClientSocket() {
		try {
			
			//socket : 서버하고 나하고 통신할 수 있는 통로. //저 숫자부분에 상대방 ip 입력시, 연결됨. 2000 부분은 맞추고
			socket = new Socket("192.168.6.18", 2000);
			
			//Stream 은 들어가는거 나가는거 반드시 따로따로 만들어야함.
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String str = null;
			
			//여기에서 일단 한번 멈추고 엔터 딱 때리게 되면 while문을 타게 된다.
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			
			//해당 buffer 안에 문자가 있으면 루프 돌기
			while ((str = sReader.readLine()) != null) {
				//문자 찍으면 저 위에 127.0.01 로 보내게 됨
				writer.println(str);
				//자기 화면에도 지가 친거 보여지게 하는 거
				System.out.println("output : " + str);
			}
			
			
			writer.close();
			reader.close();
			sReader.close();

		} catch (Exception e) {
		}
	}	
	public static void main(String[] args) {
		new MakeClientSocket();
	}	
}
