import java.util.List;
import java.util.LinkedList;

public class ArrayList {

	public static void main(String[] args) {
		//ArrayList �� �� �� �κи� �ٸ���.
		List<String> list = new LinkedList<>();
		
		//�÷��� �ν��Ͻ��� ���ڿ� �ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		 
		//����� ���ڿ� �ν��Ͻ��� ����
		for(int i = 0; i <list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
		
		//ù��° �ν��Ͻ� ����
		list.remove(0);
		
		//ù��° �ν��Ͻ� ���� �� ������ �ν��Ͻ����� ����
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + '\t');
		System.out.println();
	}

}
