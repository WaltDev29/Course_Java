package chapter06;

import java.util.Scanner;

public class Code06_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int sum = 0;

        while (true) {
            System.out.println("프로그램 종료를 원하시면 0을 입력해주세요.\n");
            System.out.print("숫자 1 ==> ");
            num1 = sc.nextInt();
            if (num1 == 0) break;
            System.out.print("숫자 2 ==> ");
            num2 = sc.nextInt();

            sum = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, sum);
        }
        System.out.println("\n프로그램 종료");
    }
}
