import java.util.HashMap;


//�ʿ��� Ű�� �𸦶�
//��� ���� ����ϴ� ���
public class HashMapExm {

	public static void main(String[] args) {
		HashMap<Integer, String> errorCodeMap = new HashMap<>();
		errorCodeMap.put(400, "Internal Error");
		errorCodeMap.put(404, "Page Not Fount");
		errorCodeMap.put(500, "Server error");
		
		for(Integer i : errorCodeMap.keySet()) {
			System.out.println("key : " + i);
			System.out.println("value : " + errorCodeMap.get(i));
		}
		
	}
}
