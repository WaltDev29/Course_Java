package chapter04;

public class LAB04_02 {
    public static void main(String[] args) {
        String str = "Java";

        System.out.println("원본 문자열 : " + str);
        System.out.print("변환 문자열 : ");
        System.out.print(str.substring(0,1).toLowerCase());
        System.out.print(str.substring(1,2).toUpperCase());
        System.out.print(str.substring(2,3).toUpperCase());
        System.out.print(str.substring(3,4).toUpperCase());

        String result ="";
        result += str.substring(0,1).toLowerCase();
        result += str.substring(1,4).toUpperCase();
        System.out.print("\n변환 문자열 : ");
        System.out.print(result);
    }
}
