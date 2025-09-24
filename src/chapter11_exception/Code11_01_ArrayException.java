package chapter11_exception;

public class Code11_01_ArrayException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            arr[3] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어났습니다.");
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}