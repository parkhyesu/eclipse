
public class Test2 {

	public static void main(String[] args) {

		int i;
		int total = 0;
		
		for (i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println(total);
		
		
		
		for(i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		for (i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				total = total + i;
			}
		}
		System.out.println(total);
		
		
	
		
		for(i = 1; i < 10; i++) {
			System.out.format("7 x %d = %d\n", i, (7*i));
		}
		
	}

}
