package chapter12_JFrame.exam02_layout;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Lab01 extends JFrame {

    public Lab01() {
        setTitle("LAB");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        CenterFrame cf = new CenterFrame(500, 500);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());


        Random rd = new Random();
        int rows = rd.nextInt(10) + 1;
        int cols = rd.nextInt(10) + 1;
        setLayout(new GridLayout(rows,cols));

        Color[] colors = {Color.RED, Color.ORANGE, Color.DARK_GRAY, Color.GREEN, Color.BLUE, Color.PINK};

        for (int i = 0; i < rows*cols; i++) {
            int num = rd.nextInt(6);
            JButton btn = new JButton("" + (num+1));
            btn.setBackground(colors[num]);
            btn.setForeground(Color.WHITE);
            add(btn);
        }

        setVisible(true);

    }

    public static void main(String[] args) {
        new Lab01();
    }
}
