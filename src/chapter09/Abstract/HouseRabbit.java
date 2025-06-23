package chapter09.Abstract;

public class HouseRabbit extends Rabbit{

    public HouseRabbit(String shape) {
        super(shape);
    }

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
