import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>();
		
		//양방향 반복자 획득
		ListIterator<String> litr = list.listIterator();
		
		String str;
		//왼쪽에서 오른쪽으로 이동을 위한 반복문
		while(litr.hasNext()) {
			str = litr.next();
			System.out.println(str + '\t');
			if(str.equals("Toy"))			//Toy 가 나오면
				litr.add("Toy2");			//Toy 2 를 저장해라.
		}
		System.out.println();

		// 오른쪽에서 왼쪽으로 이동을 위한 반복문
		while(litr.hasPrevious()) {
			str = litr.previous();
			System.out.println(str + '\t');
			if(str.equals("Robot"))			//Robot 이 나오면
				litr.add("Robot2");			//Robot2 를 저장해라
		}
		

	}

}
