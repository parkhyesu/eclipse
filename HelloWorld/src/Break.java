
public class Break {

	public static void main(String[] args) {
		/*int num = 1;
		boolean search = false;
		
		while(num < 100) {
			if((num % 5) == 0 && (num % 7) == 0) {
				search = true;
				break;
			}
			num++;
		}
		
		if(search)
			System.out.println("ã�� ���� : "+ num);
		else
			System.out.println("5�� ������� 7�� ����� ���� ã�� ���Ͽ���.");
	*/
		
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {				//num++ �� ���� �����ڶ� �����ݷб��� ��ġ�� �����
			if(((num % 5) != 0) || (num % 7) != 0)
				continue;							//5�� ���, 7�� ����� �ƴ϶�� ���� �ٽ� �ö󰡶�
			count++;
			System.out.println(num);			//5�� 7�� ����� ��쿡�� ����
		}
		System.out.println("count : " +count);
		
		
		
		

		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
