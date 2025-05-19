package chapter06;

public class Code06_09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++) {
            // 5의 배수를 제외하고 합계를 구하기
            if (i % 5 == 0) continue;
            sum += i;
        }
        System.out.println("1~100 까지 5의 배수를 제외한 합계 : " + sum);
    }
}
