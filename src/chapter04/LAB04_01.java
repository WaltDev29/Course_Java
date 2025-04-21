package chapter04;

public class LAB04_01 {
    public static void main(String[] args) {
        String str = "블랙핑크";
        System.out.println("원본 문자열 : " + str);
        System.out.print("거꾸로 문자열 : ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        for (int i=0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - (i+1)));
        }
    }
}
