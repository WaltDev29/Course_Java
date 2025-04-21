package chapter05;

import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("++++++ 홀수 / 짝수 구분 프로그램 ++++++\n");

        System.out.print("* 정수만 입력 : ");
        int num = sc.nextInt();
        String result = "";

        if (num % 2 == 0) result = "짝수";
        else result = "홀수";

        System.out.printf("### 결과 : %d은 %s입니다.", num, result);
        sc.close();
    }
}
