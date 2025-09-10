package chapter11_method;

import java.util.List;

public class Calc {
    public int plus(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int plus(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }

    public int plus(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public int plus(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
