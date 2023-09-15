
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 374, nOf100 = num/100, nOf10 = num/10%10, nOf1 = num%10;
		
		System.out.printf("정수 %d의 각 자리 숫자의 총합: %d", num, nOf100 + nOf10 + nOf1);
	}

}