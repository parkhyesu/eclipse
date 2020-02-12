import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		//�ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		//�ݺ��� ȹ�� ����
		Iterator<String> itr = list.iterator();
		
		//�ݺ��ڸ� �̿��� ������ ����
		while(itr.hasNext())
			System.out.print(itr.next() + '\t');
		
		System.out.println();
		
		//�ݺ��� �ٽ� ȹ��
		itr = list.iterator();
		
		//"Box"�� ����
		String str;							//while ������ �ݺ�����
		while(itr.hasNext()) {				//������ �ִٸ�
			str = itr.next();				//������ str �� �ְ�
			if(str.contentEquals("Box"))	//str�� �־����� "Box"���
				itr.remove();				//������
		}
		
		//�ݺ��� �ٽ� ȹ��
		itr = list.iterator();
		
		//���� �� ��� Ȯ��
		while(itr.hasNext())
			System.out.print(itr.next() + '\t');
	}

}
