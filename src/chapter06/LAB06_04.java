package chapter06;

import java.util.Scanner;

public class LAB06_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com;
        int user;
//        System.out.println("1~5의 랜덤한 값을 정했습니다.");
        for (int i=0; i<10; i++) {
            com = (int)(Math.random() * 5) + 1;
            System.out.print("숫자를 맞혀주세요 (1~5): ");
            user = sc.nextInt();
            if (com == user) {
                System.out.println("\n정답입니다!");
                System.out.println("총 시도 횟수 : " + (i+1) + "회");
                break;
            }
            else System.out.printf("땡! 틀렸습니다. 정답은 %d였습니다.\n\n", com);
//            else {
//                if (com > user) System.out.println("\n땡! 더 큰 숫자입니다.");
//                else System.out.println("\n땡! 더 작은 숫자입니다.");
//            }
        }
        System.out.printf("\n프로그램 종료");
        sc.close();
    }
}
