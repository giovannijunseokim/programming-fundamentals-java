
public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 8;
        int day = 23;
        int n = 1;
        double weight = 5.4;
        String divider = "========================";

        System.out.println(divider);
        System.out.println("고양이의 " + month + "월" + day + "일 다이어트 일지");
        System.out.println(divider);
        System.out.printf("식사 횟수: %d회\n", n);
        System.out.printf("몸무게: %.1fkg", weight);
	}

}
