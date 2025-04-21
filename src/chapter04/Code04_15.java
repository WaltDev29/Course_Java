package chapter04;

public class Code04_15 {
    public static void main(String[] args) {
        String str1 = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요~";
        // 인덱스 0부터 시작
        System.out.println(str1.indexOf("처음"));

        // 찾는 건 6번째 인덱스에서 시작하지만 결과를 세는 건 맨 처음부터 셈.
        System.out.println(str1.indexOf("처음", 6));
        System.out.println(str1.indexOf("처음", 11));

        String str2 = "Java";
        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(1));
        System.out.println(str2.charAt(2));
        System.out.println(str2.charAt(3));
        // System.out.println(str2.charAt(4));

        // 인덱스 1부터 끝까지 출력
        System.out.println(str2.substring(1));
        // 인덱스 1부터 2까지 출력
        System.out.println(str2.substring(1, 3)); // "일부" 문자열 반환
    }
}
