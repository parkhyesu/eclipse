import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 0; i < 10;i++)
			linkedList.add(0, i);

		for (int i = 0; i < 10; i++)
			System.out.format("linkedList[%d] = %d\n", i, linkedList.get(i));

		for (Integer i : linkedList)
			System.out.format("i = %d\n", i);

		List list = new SingledLinkedList();
		for (int i = 0; i < 10; i++)
			list.insertAt(0, i);

		for (int i = 0; i < 10; i++)
			System.out.format("list[%d] = %d\n", i, list.getAt(i));
		
		
		
	
		
	}

}
