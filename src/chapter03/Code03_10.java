package chapter03;

import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("\n====== 운전자 합격 조회 프로그램 ======\n");
        // 정수 입력
        System.out.print("운전자 점수를 입력 : ");
        int score = sc.nextInt();

        // 입력받은 정수의 합격 여부 판단
        String result;
        if (score >= 70) {
            result = "합격";
        }
        else {
            result = "불합격";
        }

        // 결과 출력
        System.out.printf("현재 성적을 입력한 운전자는 %s입니다.", result);
    }
}
