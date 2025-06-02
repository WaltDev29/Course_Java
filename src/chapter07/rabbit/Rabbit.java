package chapter07.rabbit;

public class Rabbit {
    public String shape;
    private int x;
    private int y;

    public Rabbit() {
        shape = "기본 토끼";
        x = 10;
        y = 10;
    }

    public Rabbit(String shape, int x, int y) {
        this.shape = shape;
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        System.out.println("토끼가 (" + x + " , " + y + ")좌표로 이동합니다.");
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "shape='" + shape + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
