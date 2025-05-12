package chapter06;

import java.util.ArrayList;

public class Code06_01 {
    public static void main(String[] args) {
        String[] names = {"김호석", "허선희", "이형원", "이도훈", "송지현", "문세진"};
        ArrayList<String> arrList = new ArrayList<>(names.length);

        for (int i=0; i<names.length; i++) {
            System.out.println(i + " : " + names[i]);
            arrList.add(names[i]);
        }

        for (String name : arrList) {
            System.out.println(name);
        }
    }
}
