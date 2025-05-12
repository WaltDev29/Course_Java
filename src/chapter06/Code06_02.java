package chapter06;

public class Code06_02 {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            System.out.print(i+1 + "\t");
            if ((i+1)%10 == 0) System.out.println();
        }
    }
}
