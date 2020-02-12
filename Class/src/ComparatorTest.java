import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
		ArrayList<String> list = new ArrayList<>(lst);
		
		for(String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();
		
		//�ߺ��� �ν��Ͻ��� �ɷ����� ���� �۾�
		HashSet<String> set = new HashSet<>(list);
		
		//������� ArrayList<String> �ν��Ͻ��� ���幰�� �ű��.
		list = new ArrayList<>(set);
		
		for(String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();

	}

}
