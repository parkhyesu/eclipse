package java_thread_sync;

class Calculator{
	private int memory;
	
	public int getMemory() {			//getter
		return memory;
	}
	
	//동기화
	public synchronized void setMemory(int memory) {	//setter
		this.memory = memory;
		
		
		try {
			Thread.sleep(2000);		//지금 돌아가고 있는 쓰레드를 2초동안 정지시키고, 다른 쓰레드가 돌아가게함.
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
//User1
class User1 extends Thread{
	private Calculator calculator;
	
	//Calculator 주입받음
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser1");	//setName() : 쓰레드에서 받아온 함수.
		this.calculator = calculator;
	}
	
	//thread 상속받게 되면 오버라이딩 시켜줘야함.
	@Override
	public void run() {
		calculator.setMemory(100);	//공유 객체에 100 저장
	}
}
//User2
class User2 extends Thread{
	private Calculator calculator;
	
	//Calculator 주입받음
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	//thread 상속받게 되면 오버라이딩 시켜줘야함.
	@Override
	public void run() {
		calculator.setMemory(50);	//공유 객체에 50 저장
	}
}
public class SyncTest {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		//start 를 하면 user1의 run 이 실행됨.
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		//start 를 하면 user2의 run 이 실행됨.
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}

}
