package chapter11_method;

import java.util.List;

public class Lab02 {
    public static void main(String[] args) {
        PickNumbers p = new PickNumbers();
        System.out.println("===== Lotto Program =====");
        List<Integer> numbers = p.pick();
        System.out.println("오늘의 로또 번호 => " + numbers);
    }
}
