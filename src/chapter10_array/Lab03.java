package chapter10_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Lab03 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] hands = {"가위", "바위", "보"};
        String[] result = new String[10000];
        String comA;
        String comB;
        int aWin = 0;
        int bWin = 0;
        int drew = 0;

        // 가위바위보 시작
        for (int i = 0; i < result.length; i++) {
            comA = hands[rand.nextInt(hands.length)];
            comB = hands[rand.nextInt(hands.length)];
            // 결과 판단
            if (comA.equals(comB)) result[i] = "없음";
            else if (comA.equals("가위")) {
                if (comB.equals("바위")) result[i] = "B";
                else if (comB.equals("보")) result[i] = "A";
            }
            else if (comA.equals("바위")) {
                if (comB.equals("가위")) result[i] = "A";
                else if (comB.equals("보")) result[i] = "B";
            }
            else if (comA.equals("보")) {
                if (comB.equals("가위")) result[i] = "B";
                else if (comB.equals("바위")) result[i] = "A";
            }
            // 디버깅용 출력
//            System.out.printf("A : %s\nB : %s\n", comA, comB);
//            System.out.printf("결과 : %s\n\n", result[i]);
        }

        // 결과 집계
        aWin = Collections.frequency(Arrays.asList(result), "A");
        bWin = Collections.frequency(Arrays.asList(result), "B");
        drew = Collections.frequency(Arrays.asList(result), "없음");

        // 이런 방식도 가능함
//        for (int i = 0; i < result.length; i++) {
//            comA = hands[rand.nextInt(hands.length)];
//            comB = hands[rand.nextInt(hands.length)];
//            // 결과 판단
//            if (comA.equals(comB)) drew++;
//            else if (comA.equals("가위")) {
//                if (comB.equals("바위")) bWin++;
//                else if (comB.equals("보")) aWin++;
//            }
//            else if (comA.equals("바위")) {
//                if (comB.equals("가위")) aWin++;
//                else if (comB.equals("보")) bWin++;
//            }
//            else if (comA.equals("보")) {
//                if (comB.equals("가위")) bWin++;
//                else if (comB.equals("바위")) aWin++;
//            }
//        }

        // 결과 출력
        System.out.printf("가위바위보 횟수 %d회\n: ", result.length);
        System.out.printf("A의 승리 횟수 : %d회\n", aWin);
        System.out.printf("B의 승리 횟수 : %d회\n", bWin);
        System.out.printf("비긴 횟수 : %d회\n", drew);

    }
}
