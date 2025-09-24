package chapter11_exception;

public class Code11_02_Arithmetic {
    public static void main(String[] args) {

        // 대입과 연산 중 연산이 먼저 실행되기 때문에 Arithmetic부분이 먼저 처리됨.
        int[] arr = {1, 2, 3};

        try {
            arr[3] = arr[2] / 0;
            arr[3] = 1234;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어났습니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("임의의 예외가 발생했습니다.");
        }
        finally {
            System.out.println("여기는 무조건 실행됩니다.");
            System.out.println("근데 finally는 생략해도 됨.");
        }
    }
}
