public class NestedFor {
    public static void main(String[] args) {

//        for (int i = 2; i <= 9; i++) {
//            for (int n = 1; n <= 9; n++) {
//                System.out.println(i + "*" + n + "=" + i * n);
//            }
//            System.out.println();
//        }

        int i = 2;
        while (i <= 9) {
            int n = 1;
            while (n <= 9) {
                System.out.println(i + "*" + n + "=" + i * n);
                n++;
            }
            System.out.println();
            i++;
        }
    }
}