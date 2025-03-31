package chapter02;

import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.print("* 정수값 입력 1 : ");
        // Scanner 객체 생성, 생성된 객체의 주소 값을 반환 받아서
        // s라는 객체를 참조하는 참조변수에 대입했음.
        int num1 = s1.nextInt();  // 정수를 입력 받아 변수에 대입
        System.out.println("사용자1 입력값 : " + num1);

        System.out.print("* 실수값 입력 2 : ");
        double num2 = s1.nextDouble();
        System.out.println("사용자2 입력값 : " + num2);
        // 자료형에 맞지 않는 값을 입력하면 InputMismatchException 에러 발생

        System.out.print("* 성명 입력 3 : ");
        String name = s2.nextLine();
        System.out.println("사용자3 입력값 : " + name);

        s1.close();  // 다 쓰면 닫기
        s2.close();

    }
}

// java lang 패키지 안에 들어있는 클래스들은 많이 사용되기 때문에 자동으로 임포트가 됨.

// wrapper class : 객체 - 기본자료형을 변환시켜주는 클래스
// ex) Integer.parseInt();
// ex) Double.parseDouble();
// 보통 ui 텍스트창에서 입력을 받을 때 사용. (ui에서는 문자열로만 입력을 받을 수 있기 때문)