import java.util.List;
import java.util.LinkedList;

public class ArrayList {

	public static void main(String[] args) {
		//ArrayList 랑 딱 이 부분만 다른것.
		List<String> list = new LinkedList<>();
		
		//컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		 
		//저장된 문자열 인스턴스의 참조
		for(int i = 0; i <list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
		
		//첫번째 인스턴스 삭제
		list.remove(0);
		
		//첫번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
	}

}
