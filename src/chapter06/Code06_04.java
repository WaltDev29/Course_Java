package chapter06;

public class Code06_04 {
    public static void main(String[] args) {
        // 500~1000 사이의 짝수의 합계를 구하시오
        int hap = 0;
        int n = 500;
        int m = 1000;
        String oddEven = "짝수";

        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) hap += i;
        }

//        for (int i = n; i <= m; i += 2) {
//            oddEven = "짝수";
//            hap += i;
//        }
        System.out.println(n + " ~ " + m + "까지의 " + oddEven + "의 합계는 " + hap + "입니다.");
    }
}
