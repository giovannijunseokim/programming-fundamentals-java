
public class PositionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = -9.81, t = 5.00, v0 = 0.00, x0 = 1000.00, x = 0.5*a*t*t + v0*t + x0;
		System.out.printf("자유낙하 물체의 %.2f초 후 위치는 %.2fm입니다.", t, x);
	}

}