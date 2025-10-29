package chapter12_JFrame.exam02_layout;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class Code12_13_BorderLayout extends JFrame{
    public Code12_13_BorderLayout() {
        setTitle("Flow Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15,15));
        String[] locs = {BorderLayout.EAST,BorderLayout.WEST,BorderLayout.SOUTH,BorderLayout.NORTH,BorderLayout.CENTER};

        CenterFrame cf = new CenterFrame(300,300);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(),cf.getFh());

        JButton[] btns = new JButton[5];
        for (int i=0; i<btns.length; i++) {
            btns[i] = new JButton("버튼"+(i+1));
            add(btns[i], locs[i]);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Code12_13_BorderLayout();
    }
}
