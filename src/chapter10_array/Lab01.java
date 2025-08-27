package chapter10_array;

import java.util.Calendar;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] quote = {
                "\"하루하루를 최선을 다해 살아라. 오늘이 바로 네 인생의 첫 날이다.\" – 마크 트웨인",
                "\"성공은 최종 목적지가 아니라, 매일의 작은 노력에서 온다.\" – 콜린 파월",
                "\"포기하지 않는 사람만이 결국 목표에 도달한다.\" – 토머스 에디슨",
                "\"자신을 믿는 순간, 이미 절반은 이긴 것이다.\" – 시어도어 루즈벨트",
                "\"배움에는 끝이 없다. 배우는 자만이 성장한다.\" – 공자"
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("### 랜덤 명언 출력기 ###");
        System.out.printf("%d년 %d월 %d일\n\n", year, month, day);
        while (true) {
            int index = (int)(Math.random() * quote.length);
            System.out.printf("Enter키를 눌러 명언을 출력하세요. (q를 입력하여 종료)\n");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("q")) break;
            System.out.println(quote[index] + "\n");
        }

        sc.close();

    }
}
