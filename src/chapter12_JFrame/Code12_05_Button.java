package chapter12_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code12_05_Button extends JFrame {
    public Code12_05_Button() {
        setTitle("Button Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setBounds(100,100,500,500);

        JButton button1 = new JButton("클릭하세요");
        // 익명 클래스 객체 생성 (일회용)
        // ActionListener는 인터페이스이므로 직접 구현 불가
        // 아래의 코드는 ActionListener 인터페이스를 상속받는 익명 클래스를 만드는 거임.
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "버튼이 클릭되었습니다.");
            }
        });

        JButton button2 = new JButton("클릭하세요2");
        JButton button3 = new JButton("클릭하세요3");
        // 리스너 객체를 생성해서 사용
        ActionListener btnListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, e.getActionCommand() + "버튼이 클릭되었습니다.");
            }
        };
        button2.addActionListener(btnListener);
        button3.addActionListener(btnListener);
        add(button1);
        add(button2);
        add(button3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Code12_05_Button();
    }
}
