package chapter11_method;

import java.util.Scanner;

public class Code11_02_userMethod_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("### 덧셈 계산기 ###-\n(1 입력 시 종료)");
        while (true) {
            System.out.print("첫 번째 숫자 입력 : ");
            n1 = sc.nextInt();
            if (n1 == -1) break;
            System.out.print("두 번째 숫자 입력 : ");
            n2 = sc.nextInt();
            if (n2 == -1) break;
            System.out.println("--- 덧셈 결과 ---");
            System.out.printf("%d + %d = %d\n\n", n1, n2, plus(n1, n2));
        }
        sc.close();
    }

    public static int plus(int n1, int n2) {
        return n1 + n2;
    }
}
