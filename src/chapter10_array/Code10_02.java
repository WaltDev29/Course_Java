package chapter10_array;

public class Code10_02 {
    public static void main(String[] args) {

        // 구구단 가로 출력
//        for (int i=2; i<=9; i++) {
//            System.out.printf("### %d단 ###\n", i);
//            for (int j=1; j<=9; j++) {
//                System.out.printf("%d × %d = %d\t\t", i, j, i*j);
//            }
//            System.out.println("\n");
//        }

        // 가로 출력 심화
        for (int j = 2; j <= 9; j++) {
            System.out.printf("### %d단 ###\t\t", j);
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d × %d = %d\t\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
