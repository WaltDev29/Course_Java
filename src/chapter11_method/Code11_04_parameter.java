package chapter11_method;

import java.util.Arrays;
import java.util.List;

public class Code11_04_parameter {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.plus(1,3,4));

        int[] arr = {1,2,3,4,5};
        System.out.println(calc.plus(arr));

        List<Integer> numList = Arrays.asList(10,20,30,40,50);
        System.out.println(calc.plus(numList));
    }
}
