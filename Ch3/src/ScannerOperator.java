import java.util.Scanner;

public class ScannerOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int input1 = scanner.nextInt();
		System.out.print("숫자 2 : ");
		int input2 = scanner.nextInt();
		
		System.out.println("합계 : " + (input1 + input2));
		System.out.println("평균 : " + (float) ((input1 + input2)/2));
	}

}