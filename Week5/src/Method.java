public class Method {
    public static void main(String[] args) {
        System.out.println("Method Start");
        method();
        System.out.println("Method Start");
        method();
    }

    public static void method() {
        System.out.println("static 메서드입니다.");
        System.out.println(5 + 6);
    }
}