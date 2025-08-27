package chapter10_array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;
        float avg;

        System.out.println("김연아 선수 경기가 끝났습니다.");
        System.out.println("# 심사위원들의 평가점수 #");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 심사위원 : ", i+1);
            try {
                scores[i] = sc.nextInt();
                if (scores[i] < 0 || scores[i] > 10) {
                    System.out.println("0~10까지의 값만 입력 가능합니다.");
                    i--;
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("0~10까지의 정수만 입력 가능합니다.");
                sc.nextLine();
                i--;
                continue;
            }
            sum += scores[i];
        }
        avg = (float) sum / scores.length;
        System.out.println("심사위원 개별 점수 : " + Arrays.toString(scores));
        System.out.printf("심사위원 평균 점수 : %.1f", avg);

        sc.close();
    }
}
