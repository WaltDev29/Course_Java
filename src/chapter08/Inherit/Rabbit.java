package chapter08.Inherit;

public class Rabbit {
    private String shape;
    private int xPos;
    private int yPos;

    public Rabbit() {
        super();
        System.out.println("Rabbit 생성자가 실행되었습니다.");
    }

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
        System.out.printf("(%d,%d)좌표로 이동합니다.\n", this.xPos, this.yPos);
    }

    // setter
    void setPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    void setShape(String shape) {
        this.shape = shape;
    }

    // getter
    String getShape() {
        return shape;
    }
    int getXPos() {
        return xPos;
    }
    int getYPos() {
        return yPos;
    }
}
