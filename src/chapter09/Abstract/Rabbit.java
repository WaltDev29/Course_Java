package chapter09.Abstract;

public abstract class Rabbit {
    // 추상 클래스
    // 추상 클래스는 객체 생성이 불가능
    // 추상 클래스가 객체화(메모리에 할당) 되어서 필드와 메소드를 사용하려면
    // 자식 클래스를 통해 객체화해서 사용해야 함
    // 추상 클래스의 용도 : 자식 클래스들에게 특정 기능들을 표준화시키기 위해 사용함
    
    String shape;
    int x;
    int y;

    public Rabbit(String shape) {
        this.shape = shape;
    }

    abstract void move(int x, int y);

    void eat (String food) {
        System.out.println("Rabbit " + shape + " eats " + food);
    }
}
