package chapter03;

import java.util.Scanner;

public class Code03_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num1 : ");
        int num2 = sc.nextInt();

        double result = Math.pow(num1, num2);

        System.out.printf("%d의 %d 제곱승은 %.0f입니다.", num1, num2, result);

        sc.close();
    }
}
