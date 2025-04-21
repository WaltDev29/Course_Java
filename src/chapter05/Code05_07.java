package chapter05;

import java.util.Scanner;

public class Code05_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== 학점 프로그램 ======");
        System.out.print("점수를 입력해주세요 : ");
        int score = sc.nextInt();
        String result = "";

        if (score >= 90) result = "A";
        else if (score >= 80) result = "B"; // score < 90 && score >= 80
        else if (score >= 70) result = "C"; // score < 80 && score >= 70
        else if (score >= 60) result = "D";
        else result = "F";

        System.out.printf("* %d점은 %s학점입니다.", score, result);
        sc.close();

    }
}
