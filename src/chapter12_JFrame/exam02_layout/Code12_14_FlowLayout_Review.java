package chapter12_JFrame.exam02_layout;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Code12_14_FlowLayout_Review extends JFrame {
    public Code12_14_FlowLayout_Review() {
        setTitle("Flow Layout Review");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT, 15,15));
        CenterFrame cf = new CenterFrame(250,250);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        ArrayList<JButton> btnList = new ArrayList<>();
        for (int i=0; i<7; i++) btnList.add(new JButton("버튼" + (i+1)));
        for (JButton btn : btnList) {
            btn.addActionListener(btnLsnr2);
            add(btn);
        }

        setVisible(true);
    }

    private ActionListener btnLsnr = e -> JOptionPane.showMessageDialog(null, e.getActionCommand());
    private ActionListener btnLsnr2 = e -> {
        JButton btn = (JButton) e.getSource();
        JOptionPane.showMessageDialog(null, btn.getText());
    };

    public static void main(String[] args) {
        new Code12_14_FlowLayout_Review();
    }
}
