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

	// hashCode 오버라이딩
	@Override
	public int hashCode() { // 오버라이딩 안했으면 그냥 주소값 리턴.
		System.out.println(super.hashCode());
		return num % 3;
	}

	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this.num == ((Num)obj).num) // num 의 값이 같으면 true 반환
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
		
		System.out.println("인스턴스의 수 : " + set.size());

		for(Num n : set) {
			System.out.println(n.toString());
		}
	}

}
