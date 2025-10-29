package chapter12_JFrame.exam02_layout;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class Code12_17_CardLayout extends JFrame {
    Code12_17_CardLayout() {
        setTitle("Card Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new CardLayout(10,10));

        CenterFrame cf = new CenterFrame(300,300);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        for (int i=0; i<3; i++) {
            JButton btn = new JButton("버튼"+(i+1));
            add(btn);
        }


        setVisible(true);
    }

    public static void main(String[] args) {
        new Code12_17_CardLayout();
    }
}
