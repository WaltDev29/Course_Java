package chapter04;

import java.util.Scanner;

public class Code04_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 문장을 입력하세요 : ");
        String str1 = sc.nextLine();
        System.out.print("두번째 문장을 입력하세요 : ");
        String str2 = sc.nextLine();

        int diffNum = str1.length() - str2.length();

        System.out.println("두 문자열 길이의 차 : " + diffNum);
        sc.close();
    }
}
