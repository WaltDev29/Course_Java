package chapter10_array;

import java.util.Arrays;
import java.util.Collections;

public class Code10_06_reverse {
    public static void main(String[] args) {
        String[] arr = {"호석", "동경", "경진", "해민", "재영", "종민"};
        System.out.println(Arrays.toString(arr));

        // reverse
        // List형을 요구하기 때문에 Arrays.asList를 사용하여 List형으로 반환
        // 그런데 arr이 List가 되는 것은 아님.
        // 하지만 원본 arr에 reverse는 적용됨. (...?)
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
