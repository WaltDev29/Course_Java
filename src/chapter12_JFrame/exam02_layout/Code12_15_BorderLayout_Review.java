package chapter12_JFrame.exam02_layout;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Code12_15_BorderLayout_Review extends JFrame {
    Code12_15_BorderLayout_Review() {
        setTitle("Border Layout Review");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15,15));

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        ArrayList<String> locs = new ArrayList<>(Arrays.asList("East","West","South","North","Center"));

        for (int i=0; i<5; i++) {
            JButton btn = new JButton(locs.get(i) + "버튼");
            btn.addActionListener(btnLsnr);
            add(btn, locs.get(i));
        }

        setVisible(true);
    }

    private ActionListener btnLsnr = e -> JOptionPane.showMessageDialog(null, e.getActionCommand());

    public static void main(String[] args) {
        new Code12_15_BorderLayout_Review();
    }
}
