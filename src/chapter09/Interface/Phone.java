package chapter09.Interface;

public interface Phone {
    // 인터페이스의 필드는 상수로만 사용이 가능
    // static final 키워드가 생략되어 있음
    String name = "Phone";
    // 써도 상관없음

    // 인터페이스는 public과 abstract를 생랼할 수 있다.
    void callPhone(String phoneNum);
    // 써도 상관없음
    public abstract void receivePhone(String phoneNum);
}
