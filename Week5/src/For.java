import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        System.out.print("5 개 정수를 입력하세요: ");
        for (i = 1; i <= 5; i++) {
            Scanner input = new Scanner((System.in));
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("합계 : " + sum);
    }
}