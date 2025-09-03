package chapter11_method;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        char op;
        int result;

        System.out.println("### 사칙연산 계산기 ###");
        System.out.println("(종료 : q)");
        while (true) {
            System.out.print("첫 번째 숫자 : ");
            n1 = Integer.parseInt(getInput(sc, null));
            System.out.print("연산자 : ");
            op = getInput(sc, Arrays.asList("+", "-", "*", "/")).charAt(0);
            System.out.print("두 번째 숫자 : ");
            n2 = Integer.parseInt(getInput(sc, null));

            try {
                result = calc(n1, n2, op);
                System.out.println("\n--- 계산 결과 ---");
                System.out.printf("%d %c %d = %d\n\n", n1, op, n2, result);
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
    }

    public static int calc(int n1, int n2, char op) {
        return switch (op) {
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n1 / n2;
            default -> 0;
        };
    }

    public static String getInput(Scanner sc, List<String> validOption) {
        while (true) {
            String input = sc.nextLine();

            // q를 입력한 경우 프로그램 종료
            if (input.equalsIgnoreCase("Q")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }


            // 숫자일 경우
            if (validOption == null) {
                try {
                    Integer.parseInt(input);
                    return input;
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                }
            } else {
                // 연산자의 경우
                if (validOption.contains(input)) return input;
                else System.out.println("+, -, *, / 중에서 입력해주세요");
            }
        }
    }
}