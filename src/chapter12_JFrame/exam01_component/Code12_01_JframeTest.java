package chapter12_JFrame.exam01_component;

import javax.swing.*;

public class Code12_01_JframeTest extends JFrame {
    // JFrame을 상속받은 클래스를 생성하는 방식
    public Code12_01_JframeTest() {
        setTitle("처음 만드는 프레임");
        // Jframe을 닫으면 프로그램이 종료되는 설정
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Code12_01_JframeTest();
    }
}
