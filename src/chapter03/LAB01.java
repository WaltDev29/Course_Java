package chapter03;

import java.util.Scanner;

public class LAB01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pound = 0.453592;
        double kilogram = 2.204623;


        System.out.print("파운드(lb)를 입력하세요 : ");
        double lb = sc.nextDouble();
        System.out.printf("%.1f파운드(lb)는 %f킬로그램(kg)입니다.\n", lb, lb / kilogram);
        System.out.print("킬로그램(kg)를 입력하세요 : ");
        double kg = sc.nextDouble();
        System.out.printf("%.1f킬로그램(kg)는 %f파운드(lb)입니다.\n", kg, kg / pound);

    }
}
