package chapter07;

public class Rabbit {
    private String shape;
    private int x;
    private int y;

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
