import java.util.HashSet;

class Num {
	private int num;

	public Num(int n) {
		num = n;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	// hashCode �������̵�
	@Override
	public int hashCode() { // �������̵� �������� �׳� �ּҰ� ����.
		System.out.println(super.hashCode());
		return num % 3;
	}

	// equals �������̵�
	@Override
	public boolean equals(Object obj) {
		if (this.num == ((Num)obj).num) // num �� ���� ������ true ��ȯ
			return true;
		else
			return false;

	} 
}

public class HashSetEqualityOne {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9966));
		set.add(new Num(7799));
		
		System.out.println("�ν��Ͻ��� �� : " + set.size());

		for(Num n : set) {
			System.out.println(n.toString());
		}
	}

}
