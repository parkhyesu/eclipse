
public class BankAccountPO {

	static int balance = 0; // 지금까지는 메인함수에서 변수를 선언했으나 지금은 여기 있음.
							// 메인함수 실행도 하기 전에 balance 공간을 마련해놓음.

	public static void main(String[] args) {

		deposit(10000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();
	}

	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public static int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}								//기능상 void 하고 return 부분 지워도 되는 함수임

}
