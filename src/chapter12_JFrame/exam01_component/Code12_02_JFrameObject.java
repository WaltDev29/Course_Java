package chapter12_JFrame.exam01_component;

import javax.swing.*;

public class Code12_02_JFrameObject {
    public static void main(String[] args) {
        // JFrame 객체를 생성하는 방식
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("기본 윈도우 창");

        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
