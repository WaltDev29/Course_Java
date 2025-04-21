package chapter05;

import java.util.Calendar;
import java.util.Scanner;

public class LAB05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== PC방 출입시간 제한 ======");
        System.out.print("* 출생연도 입력(4자리 정수) : ");
        int birthYear = sc.nextInt();

        Calendar calender = Calendar.getInstance();
        int nowYear = calender.get(Calendar.YEAR);

        int age = nowYear - birthYear;
        String resultStr = "";

        if (age >= 18) resultStr = "즐거운 시간 보내세요~";
        else resultStr = "집에 가실 시간입니다.";

        System.out.println("귀하의 나이는 " + age + "세이므로 " + resultStr);
        System.out.println("협조해 주셔서 감사합니다.");
        sc.close();
    }
}
