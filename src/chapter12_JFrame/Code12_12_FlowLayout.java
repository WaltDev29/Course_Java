package chapter12_JFrame;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class Code12_12_FlowLayout extends JFrame {
    public Code12_12_FlowLayout() {
        setTitle("Flow Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(),cf.getFh());

        JButton[] btns = new JButton[5];
        for (int i=0; i<btns.length; i++) {
            btns[i] = new JButton("버튼"+(i+1));
            add(btns[i]);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Code12_12_FlowLayout();
    }
}
