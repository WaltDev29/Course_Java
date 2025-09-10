package chapter11_method;

public class Code11_06_useInputNumbers {
    public static void main(String[] args) {
        InputNumbers numbers1 = new InputNumbers();
        int[] numbers = numbers1.input();
        Calc cal = new Calc();
        int result = cal.plus(numbers);

        System.out.println(numbers.length + "개의 정수의 합계 : " + result);
    }
}
