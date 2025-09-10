package chapter11_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code11_05_usePerson {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("김호석", 28, "M"),
                new Person("허선희", 31, "F"),
                new Person("이형원", 26, "M")
        ));

        PrintPerson pp = new PrintPerson();
        pp.print(people);
    }
}
