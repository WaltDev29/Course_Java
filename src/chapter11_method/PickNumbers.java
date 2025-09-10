package chapter11_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PickNumbers {
    public List<Integer> pick() {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        int selectedNum;
        for (int i=0; i<6; i++) {
            selectedNum = rand.nextInt(45)+1;
            if (numbers.contains(selectedNum)) {
                i--;
                continue;
            }
            numbers.add(selectedNum);
        }
        return numbers;
    }
}
