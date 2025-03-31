package chapter02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("=== 단순 계산기===\n");
        System.out.print("정수1 ==> ");
        num1 = sc.nextInt();
        System.out.print("정수1 ==> ");
        num2 = sc.nextInt();

        int resPlus, resMinus, resMultiply, resDivide, resMod;
        resPlus = num1 + num2;
        resMinus = num1 - num2;
        resMultiply = num1 * num2;
        resDivide = num1 / num2;
        resMod = num1 % num2;

        System.out.printf("%d + %d = %d\n", num1, num2, resPlus);
        System.out.printf("%d - %d = %d\n", num1, num2, resMinus);
        System.out.printf("%d * %d = %d\n", num1, num2, resMultiply);
        System.out.printf("%d / %d = %d\n", num1, num2, resDivide);
        System.out.printf("%d %% %d = %d\n", num1, num2, resMod);

        // 스스로 해본 방식
//        double num1, num2;
//
//        System.out.println("=== 단순 계산기===\n");
//        System.out.print("정수1 ==> ");
//        num1 = sc.nextDouble();
//        System.out.print("정수1 ==> ");
//        num2 = sc.nextDouble();
//
//        System.out.printf("%f + %f = %.0f\n", num1, num2, num1 + num2);
//        System.out.printf("%f - %f = %.0f\n", num1, num2, num1 - num2);
//        System.out.printf("%f * %f = %.0f\n", num1, num2, num1 * num2);
//        System.out.printf("%f / %f = %.2f\n", num1, num2, num1 / num2);
//        System.out.printf("%f %% %f = %.0f\n", num1, num2, num1 % num2);

    }
}
