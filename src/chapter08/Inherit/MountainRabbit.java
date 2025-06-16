package chapter08.Inherit;

public class MountainRabbit extends Rabbit{
    String mountainName;

    public MountainRabbit() {
        super();
        System.out.println("MountainRabbit 생성자가 실행되었습니다.");
    }

    void eat() {
        System.out.println("산토끼는 풀을 먹습니다.");
    }
}
