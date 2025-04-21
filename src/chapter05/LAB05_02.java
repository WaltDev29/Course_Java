package chapter05;

import java.util.Scanner;

public class LAB05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myHand = "";     // 사용자가 입력한 손
        String[] handList = {"가위", "바위", "보"}; // 컴퓨터가 낼 손 종류
        String comHand = "";    // 컴퓨터가 낸 손
        String result = "";     // 게임 결과
        int randomIndex = (int)(Math.random() * handList.length);

        System.out.println("###### 가위바위보 ######");
        System.out.print("가위/바위/보 중 하나를 입력하세요 : ");
        myHand = sc.next();

        comHand = handList[randomIndex];

        if (myHand.equals("가위")) {
            if (comHand.equals("가위")) result = "비겼습니다.";
            else if (comHand.equals("바위")) result = "졌습니다.";
            else result = "이겼습니다.";
        }
        else if (myHand.equals("바위")) {
            if (comHand.equals("가위")) result = "이겼습니다.";
            else if (comHand.equals("바위")) result = "비겼습니다.";
            else result = "졌습니다.";
        }
        else if (myHand.equals("보")) {
            if (comHand.equals("가위")) result = "졌습니다.";
            else if (comHand.equals("바위")) result = "이겼습니다.";
            else result = "비겼습니다.";
        }
        else System.out.println("가위/바위/보 중 하나를 입력해주세요.");
        
        System.out.print(result);
        sc.close();
    }
}
