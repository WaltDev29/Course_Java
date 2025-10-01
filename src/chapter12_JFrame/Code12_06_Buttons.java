package chapter12_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code12_06_Buttons extends JFrame {
    public Code12_06_Buttons() {
        setTitle("Buttons Test");
        setBounds(100,100,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] btnTexts = {"한국", "폴리텍", "서울", "정수", "인공지능소프트웨어"};
        JButton[] buttons = new JButton[btnTexts.length];
        for (int i=0; i<buttons.length; i++) {
            buttons[i] = new JButton(btnTexts[i]);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, e.getActionCommand() + " 버튼이 클릭되었습니다.");
                }
            });
            add(buttons[i]);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Code12_06_Buttons();
    }
}