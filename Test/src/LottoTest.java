//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		
		Set<Integer> setLotto = new TreeSet<>();
		
		while(setLotto.size() < 6) {
			setLotto.add((int)(Math.random()*45)+1);
		}
		//() 안에 객체 넣으면 배열 형태로 출력해줌
		System.out.println(setLotto);
	}

}
