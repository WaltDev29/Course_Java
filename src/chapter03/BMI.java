package chapter03;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height;

        System.out.println("\n====== BMI 체질량지수 계산기 ======\n");
        System.out.print("키(cm)를 입력하세요 : ");
        height = sc.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 : ");
        weight = sc.nextDouble();

        double cmToM = height/100;

        System.out.printf("키 : %.2fcm\n 몸무게 : %.2fkg\n", height, weight);
        System.out.printf("BMI 지수 : %.2f\n", weight/Math.pow(cmToM, 2));

        sc.close();

    }
}
