package chapter08.Inherit;

public class RabbitTest {
    public static void main(String[] args) {
        HouseRabbit hr1 = new HouseRabbit();
        MountainRabbit mr1 = new MountainRabbit();

        hr1.ownerName = "오폴리";
        hr1.setShape("동그라미");
        hr1.move(50, 70);
        hr1.eat();
        
        mr1.mountainName = "한라산";
        mr1.setShape("네모");
        mr1.move(30,30);
        mr1.eat();
    }
}
