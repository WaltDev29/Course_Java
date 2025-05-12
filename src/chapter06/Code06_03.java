package chapter06;

public class Code06_03 {
    public static void main(String[] args) {
        int hap = 0;
        int n = 100;
        String oddEven = "";
        for (int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                oddEven = "홀수";
                hap += i;
            }
        }
        System.out.println("1 ~ " + n + "까지의 " + oddEven + "의 합계는 " + hap + "입니다.");
    }
}
