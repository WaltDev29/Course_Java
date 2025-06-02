package chapter07.rabbit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rabbit rb = new Rabbit();
        rb.setShape("둥글둥글");
        rb.setPosition(0, 0);

        int ux = 0;
        int uy = 0;
        String answer;

        while (true) {
            while(true) {
                try {
                    System.out.print("토끼가 이동할 X좌표 ==> ");
                    ux = sc.nextInt();
                    System.out.print("토끼가 이동할 Y좌표 ==> ");
                    uy = sc.nextInt();
                    rb.setPosition(ux, uy);
                    break;
                }
                catch(InputMismatchException e) {
                    System.out.println("숫자를 입력해주세요.");
                    sc.nextLine();
                }
            }
            rb.setPosition(ux, uy);
            rb.move();
            System.out.print("계속할까요? (y/n) : ");
            sc.nextLine();
            answer = sc.nextLine();
            if (answer.equals("n") || answer.equals("N")) break;
        }
        sc.close();
    }
}
