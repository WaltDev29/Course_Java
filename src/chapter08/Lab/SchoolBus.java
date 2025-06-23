package chapter08.Lab;

public class SchoolBus extends Car{
    public SchoolBus(String name) {
        super(name);
    }

    public void speedUp(int up) {
        super.speedUp(up);
        if (this.getSpeed() > 60) this.setSpeed(60);
        System.out.printf("** %s의 현재 속도 : %d\n", this.getName(), this.getSpeed());
    }
}
