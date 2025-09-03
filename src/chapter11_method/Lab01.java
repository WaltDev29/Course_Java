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
            n1 = getNumber(sc);
            System.out.print("연산자 : ");
            op = getInput(sc);
            System.out.print("두 번째 숫자 : ");
            n2 = getNumber(sc);

            try {
                result = calc(n1, n2, op);
                System.out.println("--- 계산 결과 ---");
                System.out.printf("%d %c %d = %d\n\n", n1, op, n2, result);
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
    }

    public static int calc(int n1, int n2, char op) {
        int result;
        switch (op) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                result = 0;
        }
        return result;
    }

    public static int getNumber(Scanner sc) {
        String inNum;   // 입력한 문자
        int num;    // 숫자로 변환

        while (true) {
            inNum = sc.nextLine();

            // q를 입력하면 프로그램 종료
            if (inNum.equalsIgnoreCase("Q")) {
                System.out.printf("프로그램을 종료합니다.");
                System.exit(0);
            }

            try {
                // 문자열을 숫자로 변환 (숫자가 아니면 catch에 걸림)
                num = Integer.parseInt(inNum);
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n숫자를 입력해주세요.");
                System.out.print("다시 입력 : ");
            }
        }
        return num;
    }

    public static char getInput(Scanner sc) {
        String inOp;    // 입력한 연산자
        char op;    // char로 형변환
        List<String> ops = Arrays.asList("+", "-", "*", "/");  // 사칙 연산인지 확인하기 위한 List

        while (true) {
            inOp = sc.nextLine();

            // q를 입력한 경우 프로그램 종료
            if (inOp.equalsIgnoreCase("Q")) {
                System.out.printf("프로그램을 종료합니다.");
                System.exit(0);
            }

            // 사칙 연산이 아닌 경우 continue
            if (!ops.contains(inOp)) {
                System.out.println("\n+, -, *, / 중에서 입력해주세요");
                System.out.print("다시 입력 : ");
                continue;
            }
            break;
        }
        op = inOp.charAt(0);    // 입력한 연산자를 char형으로 변환
        return op;
    }
}