package chapter12_JFrame.exam02_layout;

import center_frame.CenterFrame;

import javax.swing.*;

public class Code12_18_NullLayout extends JFrame {
    Code12_18_NullLayout() {
        setTitle("Null Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        CenterFrame cf = new CenterFrame(300,300);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        int[] xy = {50,70,90,110};

        for (int i=0; i<xy.length; i++) {
            JButton btn = new JButton("버튼"+ (i+1));
//            btn.setBounds((i*30),(i*30),100,50);
            btn.setBounds(xy[i],xy[i],70,60);
            add(btn);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Code12_18_NullLayout();
    }
}
