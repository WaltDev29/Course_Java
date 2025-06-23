package chapter09.Interface;

// 인터페이스
// 필드 : 상수
// 메소드 : 추상 메소드 (예외적으로 default 키워드를 붙여 메소드 구현 가능)
// 용도 : 
// - 규칙(추상 메소드)을 정해 놓고 규칙을 지킨 클래스만 만들 수 있음
// - 메소드 이름, 반환형, 매개변수를 중간에 수정/삭제를 함부로 하지 못하도록 함
// - 따라서 공동작업할 때 정말 많이 사용
// [인터페이스를 상속 받은 클래스]는 추상 메소드 와에 일반적인 다른 메소드도 구현 가능

public class PhoneTest {
    public static void main(String[] args) {
        TelePhone tel = new TelePhone();
        FeaturePhone feat = new FeaturePhone();
        SmartPhone smart = new SmartPhone();
        Phone phone = new SmartPhone();

        tel.answeringMachine("지금은 전화를 받을 수 없습니다.");
        tel.callPhone("010-1234-5678");
        tel.receivePhone("010-8765-4321");
        
        feat.sendSMS("010-1234-1234", "인터페이스 학습중입니다.");

        ((SmartPhone)phone).installApp("카카오톡");
    }
}
