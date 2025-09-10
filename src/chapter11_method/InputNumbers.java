package chapter11_method;

import java.util.Scanner;

public class InputNumbers {

    public int[] input() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 수 입력 : ", i+1);
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return numbers;
    }
}
