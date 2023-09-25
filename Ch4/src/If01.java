import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");

        int num = input.nextInt();

        if(num % 2 == 0) System.out.println("짝수");
        else System.out.println("홀수");

        System.out.println("Good bye");
    }
}