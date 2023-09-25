import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요.");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        switch (num / 10) {
            case 10:
            case 9:
                System.out.print("A");
                break;
            case 8:
                System.out.print("B");
                break;
            case 7:
                System.out.print("C");
                break;
            case 6:
                System.out.print("D");
                break;
            default:
                System.out.print("F");
                break;
        }

        System.out.println(" 학점");
    }
}