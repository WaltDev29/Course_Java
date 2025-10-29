package chapter12_JFrame.exam01_component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Assign01 extends JFrame {

    public Assign01() {
        setTitle("Assign01");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,300,500,500);
        setLayout(new FlowLayout());

        // 20 텍스트 입력할 수 있는 크기의 TextField
        JTextField tf = new JTextField(20);
        JButton btn = new JButton("확인");

        // 함수형 인터페이스 (메서드가 오직 하나인 인터페이스)는 람다식으로 객체 생성 가능
        ActionListener btnLsnr = e -> JOptionPane.showMessageDialog(null, tf.getText());

        btn.addActionListener(btnLsnr);

        add(tf);
        add(btn);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Assign01();
    }
}
