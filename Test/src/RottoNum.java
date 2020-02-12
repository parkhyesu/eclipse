import java.util.Arrays;
import java.util.Random;


interface IRottoNum{
	int[] randomNum();
}

public class RottoNum implements IRottoNum{

	int[] lotto;
	@Override
	public int[] randomNum() {
		Random random = new Random();
		lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					
					System.out.println("중복입니다." + i + "==" + j);
					break;
				}
			}
		}
		return lotto;
	}
	
	public void printLottoNum() {
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main(String[] args) {
		IRottoNum rottoNum = new RottoNum();
		rottoNum.randomNum();
		((RottoNum)rottoNum).printLottoNum();
	}

}
