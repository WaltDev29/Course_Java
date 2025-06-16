package chapter08.Rabbit;

public class Rabbit {
    String shape;
    int xPos;
    int yPos;
    static int count;
    // static은 상수 선언할 때도 많이 쓰임
    static final String NAME = "Rabbit";

    Rabbit() {
        count++;
    }
}
