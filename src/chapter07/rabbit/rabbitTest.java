package chapter07.rabbit;

public class rabbitTest {
    public static void main(String[] args) {
        Rabbit rb1 = new Rabbit();
        Rabbit rb2 = new Rabbit();
        Rabbit rb3 = new Rabbit();

        System.out.println(rb1);
        System.out.println(rb2);
        System.out.println(rb3);

        rb1.shape = "둥글둥글";
        rb1.setPosition(10,10);
        rb2.setShape("네모네모");
        rb2.setPosition(30,30);
        rb3.setShape("세모세모");
        rb3.setPosition(100,50);

        System.out.println(rb1);
        System.out.println(rb2);
        System.out.println(rb3);

        rb1.move();
    }
}
