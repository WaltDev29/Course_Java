package chapter04;

public class Code04_08 {
    public static void main(String[] args) {
        String str1 = "한국폴리텍대학\n인공지능소프트웨어\n1학년";   // 이렇게 줄바꿈문자 넣는 방식은 생각도 못했다!
        System.out.println(str1);

        String str2 = "Polytech\t\"AISoftware\"\tFreshman";
        System.out.println(str2);

        String str3 = "한국폴리텍";
        System.out.println(str3);
        System.out.println("str3.length() : " + str3.length());
    }
}
