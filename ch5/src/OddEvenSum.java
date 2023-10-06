import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        while (true) {
            System.out.print("두 양의 정수를 입력하세요. : ");
            float _a = s.nextFloat();
            float _b = s.nextFloat();

            a = (int) _a;
            b = (int) _b;

            if (a < b) break;
            System.out.println("첫 번째 정수는 두 번째 정수보다 작아야 합니다.");
        }

        int oddSum = 0;
        int evenSum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) evenSum += i;
            else oddSum += i;
        }

        System.out.println("홀수의 합 : " + oddSum);
        System.out.println("짝수의 합 : " + evenSum);
    }
}