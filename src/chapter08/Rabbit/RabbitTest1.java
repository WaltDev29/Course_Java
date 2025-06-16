package chapter08.Rabbit;

public class RabbitTest1 {
    public static void main(String[] args) {
        System.out.println("객체 생성 전 총 토끼 수 ==> " + Rabbit.count);

        Rabbit rb1 = new Rabbit();
        System.out.println("토끼 객체1 생성 후 총 토끼 수 ==> " + Rabbit.count);

        Rabbit rb2 = new Rabbit();
        System.out.println("토끼 객체2 생성 후 총 토끼 수 ==> " + Rabbit.count);

        System.out.println("토끼 객체들의 이름 ==> " + Rabbit.NAME);
    }
}