package java_chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//Ŭ���̾�Ʈ
public class MakeClientSocket {
	//Server�� �ƴϱ⶧���� ��ٸ� �ʿ䰡 ��� ServerSocket �� �ʿ� ����
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;

	MakeClientSocket() {
		try {
			
			//socket : �����ϰ� ���ϰ� ����� �� �ִ� ���. //�� ���ںκп� ���� ip �Է½�, �����. 2000 �κ��� ���߰�
			socket = new Socket("192.168.6.18", 2000);
			
			//Stream �� ���°� �����°� �ݵ�� ���ε��� ��������.
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String str = null;
			
			//���⿡�� �ϴ� �ѹ� ���߰� ���� �� ������ �Ǹ� while���� Ÿ�� �ȴ�.
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			
			//�ش� buffer �ȿ� ���ڰ� ������ ���� ����
			while ((str = sReader.readLine()) != null) {
				//���� ������ �� ���� 127.0.01 �� ������ ��
				writer.println(str);
				//�ڱ� ȭ�鿡�� ���� ģ�� �������� �ϴ� ��
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
