package chapter11_method;

import java.util.List;

public class PrintPerson {
    public void print(List<Person> people) {
        for (Person p : people) {
            System.out.printf("이름 : %s\n나이 : %d\n성별 : %s\n\n", p.name, p.age, p.gender);
        }
    }
}
