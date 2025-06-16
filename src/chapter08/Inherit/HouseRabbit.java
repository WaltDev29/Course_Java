package chapter08.Inherit;

public class HouseRabbit extends Rabbit {
    String ownerName;

    public HouseRabbit() {
        super();
        System.out.println("HouseRabbit 생성자가 실행되었습니다.");
    }

    void eat() {
        System.out.println("집토끼는 사료를 먹습니다.");
    }

    @Override
    void move(int x, int y) {
        if (x > 100) x = 100;
        if (y > 100) y = 100;
        this.setPos(x,y);
        System.out.printf("(%d,%d)좌표로 이동합니다.\n", this.getXPos(), this.getYPos());
    }
}
