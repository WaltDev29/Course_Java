package chapter06;

public class Code06_03 {
    public static void main(String[] args) {
        int hap = 0;
        int n = 100;
        for (int i=1; i<=n; i++) {
            hap += i;
        }
        System.out.println("1 ~ " + n + "까지의 합계는 " + hap + "입니다.");
    }
}
