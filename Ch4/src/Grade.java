import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.print("성적을 입력하세요 : ");

        Scanner s = new Scanner(System.in);
        float score = s.nextFloat();
        System.out.print(score + "점 -> ");

        if (score >= 95) System.out.print("A+");
        else if (score >= 90) System.out.print("A");
        else if (score >= 85) System.out.print("B+");
        else if (score >= 80) System.out.print("B");
        else System.out.print("C+");

        System.out.println(" 학점");
    }
}