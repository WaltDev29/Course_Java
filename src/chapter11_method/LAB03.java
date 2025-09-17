package chapter11_method;

import java.util.Scanner;

public class LAB03 {
    static boolean checkPassword(String pwd) {
        if (pwd.length() < 8) return false;
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if (!Character.isAlphabetic(ch)
            && !Character.isDigit(ch))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd = "";

        while (true) {
            System.out.println("비밀번호를 입력하세요.");
            System.out.println("8자리 이상, 한글, 영어, 숫자만 입력 가능");
            System.out.print("비밀번호 입력 : ");
            pwd = sc.nextLine();

            if (checkPassword(pwd)) break;
            else {
                System.out.println("잘못된 비밀번호입니다.\n다시 입력해주세요.\n");
            }
        }

        System.out.println("비밀번호 설정이 완료되었습니다.");
        System.out.println("설정한 비밀번호 : " + pwd);
        sc.close();
    }
}
