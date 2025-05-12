package chapter06;

public class LAB06_01 {
    public static void main(String[] args) {
        // n명의 줄을 세우는 방법에 대한 경우의 수
        int fact = 1;   // 팩토리얼 값을 구하기 위한 변수
        int count = 7;  // n명
        for (int i=1; i<=count; i++) {
            fact *= i;
        }
        System.out.println(count + "명의 줄을 세울 수 있는 경우의 수 : " + fact + "개입니다.");
    }
}