
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
			System.out.println("찾는 정수 : "+ num);
		else
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못하였다.");
	*/
		
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {				//num++ 는 후위 연산자라 세미콜론까지 마치고 실행됨
			if(((num % 5) != 0) || (num % 7) != 0)
				continue;							//5의 배수, 7의 배수가 아니라면 위로 다시 올라가라
			count++;
			System.out.println(num);			//5와 7의 배수인 경우에만 실행
		}
		System.out.println("count : " +count);
		
		
		
		

		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
