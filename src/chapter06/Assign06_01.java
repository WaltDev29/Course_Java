package chapter06;

public class Assign06_01 {
    public static void main(String[] args) {
//        for (int i=2; i<=9; i++) {
//            for (int j=1; j<=9; j++) {
//                System.out.printf("%d × %d = %2d \t", i, j, i*j);
//            }
//            System.out.println("\n----------------------------------------------------------------------------------------------------------");
//        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d × %d = %2d  |  ", j, i, j * i);
            }
            System.out.println();
        }
    }
}
