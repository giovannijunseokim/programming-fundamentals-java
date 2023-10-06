import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.next();

        System.out.print("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();

        String stars = "**********************************************************";
        String welcomeMall = "Welcome to Shopping Mall";
        String welcomeMarket = "Welcome to Book Market!";

        String menu1 = "1. 고객 정보 확인하기";
        String menu2 = "2. 장바구니 상품 목록 보기";
        String menu3 = "3. 장바구니 비우기";
        String menu4 = "4. 바구니에 항목 추가하기";
        String menu5 = "5. 장바구니의 항목 수량 줄이기";
        String menu6 = "6. 장바구니의 항목 삭제하기";
        String menu7 = "7. 영수증 표시하기";
        String menu8 = "8. 종료";

        boolean quit = false;
        while (!quit) {
            System.out.println(stars);
            System.out.println("\t" + welcomeMall);
            System.out.println("\t" + welcomeMarket);
            System.out.println(stars);
            System.out.printf("%s\t\t%s\n", menu1, menu4);
            System.out.printf("%s\t%s\n", menu2, menu5);
            System.out.printf("%s\t\t%s\n", menu3, menu6);
            System.out.printf("%s\t\t%s\n", menu7, menu8);
            System.out.println(stars);
            System.out.print("메뉴 번호를 선택해주세요");

            int n = input.nextInt();
            if (n < 1 || n > 8) {
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
            } else {
                switch (n) {
                    case 1:
                        System.out.println("현재 고객 정보 : ");
                        System.out.println("이름 " + userName + " 연락처" + userMobile);
                        break;
                    case 2:
                        System.out.println("장바구니 상품 목록 보기 : ");
                        break;
                    case 3:
                        System.out.println("장바구니 비우기");
                        break;
                    case 4:
                        System.out.println("장바구니에 항목 추가하기 : ");
                        break;
                    case 5:
                        System.out.println("5. 장바구니의 항목 수량 줄이기");
                        break;
                    case 6:
                        System.out.println("6. 장바구니의 항목 삭제하기");
                        break;
                    case 7:
                        System.out.println("7. 영수증 표시하기");
                        break;
                    case 8:
                        System.out.println("8. 종료");
                        quit = true;
                        break;
                }
            }
        }
    }
}