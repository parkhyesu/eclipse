import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>();
		
		//����� �ݺ��� ȹ��
		ListIterator<String> litr = list.listIterator();
		
		String str;
		//���ʿ��� ���������� �̵��� ���� �ݺ���
		while(litr.hasNext()) {
			str = litr.next();
			System.out.println(str + '\t');
			if(str.equals("Toy"))			//Toy �� ������
				litr.add("Toy2");			//Toy 2 �� �����ض�.
		}
		System.out.println();

		// �����ʿ��� �������� �̵��� ���� �ݺ���
		while(litr.hasPrevious()) {
			str = litr.previous();
			System.out.println(str + '\t');
			if(str.equals("Robot"))			//Robot �� ������
				litr.add("Robot2");			//Robot2 �� �����ض�
		}
		

	}

}
