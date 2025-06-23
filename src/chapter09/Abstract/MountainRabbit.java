package chapter09.Abstract;

public class MountainRabbit extends Rabbit {

    public MountainRabbit(String shape) {
        super(shape);
    }

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void run() {
        System.out.println("Mountain Rabbit은 이산 저산 뛰어다닌다.");
    }
}
