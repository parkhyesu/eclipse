import java.util.HashMap;
import java.util.Scanner;

public class HashTest {

	public static void main(String[] args) {
		
		// Key 값이 나라 이름이 되는 것.
		HashMap<String, Integer> nations = new HashMap<>();
		System.out.println("나라 이름과 인구를 입력하세요. (예 : Korea 5000)");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("나라 이름, 인구 >> ");
			String nation = scanner.next();
			
			if(nation.equals("그만"))
				break;				//그만이면 while 문을 빠져나가라
			
			int population = scanner.nextInt();	//그만 이 아니면 여기로와서
			
			nations.put(nation, population);	//입력받은 것들 저장.
		}
		
		while(true) {
			System.out.println("인구 검색 >> ");
			String nation = scanner.next();
			
			if(nation.equals("그만"))
				break;
			
			Integer n = nations.get(nation);
			
			if(n == null)
				System.out.println(nation + "나라는 없습니다.");
			else
				System.out.println(nation + "의 인구는 " + n);
		}
		
		System.out.println("프로그램 종료입니다.");
		scanner.close();
	}

}
