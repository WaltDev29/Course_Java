package chapter07.access;

public class RabbitTest {
    public static void main(String[] args) {
        // Private
        PrivateRabbit r1 = new PrivateRabbit();
        r1.setShape("Rectangle");
        r1.setPosition(50, 100);
        System.out.println("r1 토끼 모양 : " + r1.getShape());
        System.out.println("r1 토끼 위치 : (" + r1.getX() + "," + r1.getY() + ")");
        System.out.println();

        // Public
        PublicRabbit r2 = new PublicRabbit();
        r2.shape = "네모네모";
        r2.x = 30;
        r2.y = 60;
        System.out.printf("r2 토끼 모양 : %s\n", r2.shape);
        System.out.printf("r2 토끼 위치 : (%d,%d)\n", r2.x, r2.y);
        System.out.println();
    }
}