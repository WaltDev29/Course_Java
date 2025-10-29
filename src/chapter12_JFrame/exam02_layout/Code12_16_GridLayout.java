package chapter12_JFrame.exam02_layout;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Code12_16_GridLayout extends JFrame {
    Code12_16_GridLayout() {
        setTitle("Gird Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3,10,10));

        CenterFrame cf = new CenterFrame(300,300);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        for (int i=0; i<9; i++) {
            JButton btn = new JButton("버튼"+(i+1));
            btn.addActionListener(btnLsnr);
            add(btn);
        }

        setVisible(true);
    }

    private ActionListener btnLsnr = e -> JOptionPane.showMessageDialog(null, e.getActionCommand());

    public static void main(String[] args) {
        new Code12_16_GridLayout();
    }
}
