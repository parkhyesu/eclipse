import java.util.*;


public class CollectionSample {

	public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	
		for (int i = 0; i < 10; i++)
			list.addLast(i);
		
		for (Integer temp : list) {
			System.out.println("temp = " + temp);
		}
	}
	//����(index) �ʿ��� ���
			//for (int i = 0; i <list.size(); i++) {
				//System.out.println("temp = "+ list.get(i));
			//}
}
