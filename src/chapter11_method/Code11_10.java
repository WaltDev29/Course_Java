package chapter11_method;

public class Code11_10 {
    static int a = 100;

    public static void method1() {
        int a = 200;
        System.out.println(a);
    }

    public static void method2() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
