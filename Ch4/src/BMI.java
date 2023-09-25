import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.print("키(cm) : ");
        Scanner s = new Scanner(System.in);
        float heightByCm = s.nextFloat();
        float heightByM = heightByCm / 100;

        System.out.print("체중(kg) : ");
        float weight = s.nextFloat();

        float bmi = weight / (heightByM * heightByM);

        System.out.printf("BMI: %.2f\n비만도: ", bmi);
        if (bmi >= 30) System.out.println("비만");
        else if (bmi >= 25) System.out.println("과체중");
        else if (bmi >= 18.5) System.out.println("정상");
        else System.out.println("저체중");
    }
}