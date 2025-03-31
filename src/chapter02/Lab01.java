package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        String name, addr;
        int weight, price;

        // 입력 받는 부분
        System.out.println("## 복습용 실습1 택배 보내기 프로그램 :  다음 항목을 입력하세요. ##");
        System.out.print("받는 사람 : ");
        name = s1.nextLine();
        System.out.print("주소 : ");
        addr = s1.nextLine();
        System.out.print("무게(g) : ");
        weight = s2.nextInt();
        
        // 배송비 계산 : 1g당 5원
        price = weight * 5;
        
        // 결과 출력
        System.out.println();
        System.out.println("** 받는 사람 ==> " + name + "님");
        System.out.println("** 주소 ==> " + addr);
        System.out.println("** 배송비 ==> " + price + "원");

        // 스캐너 닫기
        s1.close();
        s2.close();
    }
}
