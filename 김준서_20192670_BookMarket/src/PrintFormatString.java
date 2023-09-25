
public class PrintFormatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item = "라면";
		int price = 800;
		double weight = 0.12d;
		boolean discounted = false;
		
		System.out.printf("상품-%s\n가격-%d\n무게-%fkg\n할인여부-%b",
				item, price, weight, discounted);
	}

}
