package chapter08.Lab;

public class Car {
    private String name;
    private int speed;

    public Car(String name) {
        this.name = name;
        this.speed = 0;
    }

    public void speedUp(int up) {
        this.speed += up;
        System.out.printf("** %s의 현재 속도 : %d\n", name, speed);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
