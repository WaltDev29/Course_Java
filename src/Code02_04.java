public class Code02_04 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        int c = a + b;
        System.out.println(c);

        System.out.println(a + " + " + b + " = " + c);  // println 메서드 오버로딩 덕분에 형식지정자 없이 출력 가능
        System.out.printf("%d + %d = %d\n", a, b, c);   // 형식에 맞지 않으면 Exception 오류 발생 (Exception : 형식이 맞지 않음)

        int result = b - a;
        System.out.println(result);
        System.out.printf("%d - %d = %d\n", b, a, result);

        int num1 = 50;
        int num2 = 100;

        result = num1 * num2;
        System.out.println(result);
        System.out.printf("%d * %d = %d\n", num1, num2, result);

        result = num1 / num2;
        System.out.println(result);

        result = num2 / num1;
        System.out.println(result);
        System.out.printf("%d / %d = %d", num2, num1, result);
    }
}
