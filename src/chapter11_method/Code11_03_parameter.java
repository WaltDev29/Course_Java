package chapter11_method;

import java.util.Scanner;

public class Code11_03_parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();
        System.out.print("첫 번째 수 입력 : ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 수 입력 : ");
        int n2 = sc.nextInt();

        System.out.printf("%d + %d = %d", n1, n2, calc.plus(n1,n2));
    }
}