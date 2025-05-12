package chapter06;

public class LAB06_02 {
    public static void main(String[] args) {
//        for (int i=2; i<10; i++) {
//            for (int j=1; j<10; j++) {
//                System.out.printf("%d × %d = %d\n", i, j, i*j);
//            }
//            System.out.println();
//        }

        System.out.printf("%4c  ", 'X');
        for (int i=1; i<=10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n   -----------------------------------------");
        for (int i=1; i<=10; i++) {
                System.out.printf("%4d |", i);
            for (int j=1; j<=10; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
}
