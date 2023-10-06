public class Star {
    public static void main(String[] args) {
        for (int column = 1; column <= 6; column++) {
            for (int row = 1; row <= column; row++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}