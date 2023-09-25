
public class Welcome {

	public static void main(String[] args) {
		// System.out.println("Welcome to Shopping Mall");
		// System.out.println("Welcome to Book Market!");
		
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
		
		System.out.println(stars);
		System.out.println("\t" + welcomeMall);
		System.out.println("\t" + welcomeMarket);
		System.out.println(stars);
		System.out.printf("%s\t\t%s\n", menu1, menu4);
		System.out.printf("%s\t%s\n", menu2, menu5);
		System.out.printf("%s\t\t%s\n", menu3, menu6);
		System.out.printf("%s\t\t%s\n", menu7, menu8);
		System.out.println(stars);
	}

}