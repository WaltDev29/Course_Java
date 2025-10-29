package chapter12_JFrame.exam01_component;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Code12_10_TextField extends JFrame {
    JTextField tf;
    JTextArea ta;
    JPasswordField pf;
    JButton btn;

    public Code12_10_TextField() {
        setTitle("Text Filed");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        CenterFrame cf = new CenterFrame(250,250);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        tf = new JTextField(10);
        ta = new JTextArea(5,10);
        pf = new JPasswordField(10);
        btn = new JButton("알림 출력");
        btn.addActionListener(btnLsnr);

        add(tf);
        add(ta);
        add(new JScrollPane(ta));
        add(pf);
        add(btn);

        setVisible(true);
    }

    private ActionListener btnLsnr = e -> {
        String tftext = tf.getText();
        String taText = ta.getText();
        String pfText = String.copyValueOf(pf.getPassword());   //pf.getText();
        JOptionPane.showMessageDialog(null,tftext+'\n'+taText+'\n'+pfText);
    };

    public static void main(String[] args) {
        new Code12_10_TextField();
    }
}
