import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		float weight = scanner.nextFloat();
		boolean isMarried = scanner.nextBoolean();
		
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신이 사는 도시는 %s입니다.\n", city);
		System.out.printf("당신의 나이는 %d입니다.\n", age);
		System.out.printf("당신의 체중은 %.1f입니다.\n", weight);
		System.out.printf("당신의 독신 여부는 %b입니다.\n", isMarried);
	}

}
