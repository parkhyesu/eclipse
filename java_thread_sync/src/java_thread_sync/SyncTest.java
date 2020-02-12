package java_thread_sync;

class Calculator{
	private int memory;
	
	public int getMemory() {			//getter
		return memory;
	}
	
	//����ȭ
	public synchronized void setMemory(int memory) {	//setter
		this.memory = memory;
		
		
		try {
			Thread.sleep(2000);		//���� ���ư��� �ִ� �����带 2�ʵ��� ������Ű��, �ٸ� �����尡 ���ư�����.
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
//User1
class User1 extends Thread{
	private Calculator calculator;
	
	//Calculator ���Թ���
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser1");	//setName() : �����忡�� �޾ƿ� �Լ�.
		this.calculator = calculator;
	}
	
	//thread ��ӹް� �Ǹ� �������̵� ���������.
	@Override
	public void run() {
		calculator.setMemory(100);	//���� ��ü�� 100 ����
	}
}
//User2
class User2 extends Thread{
	private Calculator calculator;
	
	//Calculator ���Թ���
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	//thread ��ӹް� �Ǹ� �������̵� ���������.
	@Override
	public void run() {
		calculator.setMemory(50);	//���� ��ü�� 50 ����
	}
}
public class SyncTest {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		//start �� �ϸ� user1�� run �� �����.
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		//start �� �ϸ� user2�� run �� �����.
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}

}
