package chapter12_JFrame;

import javax.swing.*;

public class Code12_01_JframeTest extends JFrame {
    // JFrame을 상속받은 클래스를 생성하는 방식
    public Code12_01_JframeTest() {
        setTitle("처음 만드는 프레임");
        setSize(500,500);
        setLocation(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Code12_01_JframeTest();
    }
}
