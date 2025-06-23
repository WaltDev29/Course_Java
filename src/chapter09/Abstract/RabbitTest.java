package chapter09.Abstract;

public class RabbitTest {
    public static void main(String[] args) {
        HouseRabbit h = new HouseRabbit("동글");
        MountainRabbit m = new MountainRabbit("뾰족");

        h.move(10, 20);
        m.move(1000,2000);

        m.run();

        h.eat("grass");
    }
}
