package chapter06;

import java.util.Random;
import java.util.Scanner;

public class LAB06_03 {
    public static void main(String[] args) {
        // 세 개의 주사위를 던져서 같은 값이 나오면 탈출
        // 주사위 값, 반복횟수 출력

        Random rand = new Random();
//        Scanner sc = new Scanner(System.in);
        int dice1,dice2,dice3;
        int count = 0;
//        System.out.println("Enter키를 눌러 주사위를 굴려주세요.");
        while (true) {
//            sc.nextLine();
            count++;
            dice1 = rand.nextInt(6)+1;
            dice2 = rand.nextInt(6)+1;
            dice3 = rand.nextInt(6)+1;
            System.out.printf("%d번째 시도 : %d %d %d\n", count, dice1, dice2, dice3);
            if (dice1 == dice2 && dice2 == dice3) break;
        }
        System.out.printf("\n모두 같은 숫자가 나왔습니다.\n주사위 숫자 : %d", dice1);
        System.out.printf("\n총 반복 횟수 : %d", count);
//        sc.close();
    }
}
