package chapter12_JFrame;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Code12_11_List_ComboBox extends JFrame {
    JList li;
    JComboBox cb;
    JButton btn;
    public Code12_11_List_ComboBox() {
        setTitle("List & ComboBox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        CenterFrame cf = new CenterFrame(200,200);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(),cf.getFh());

        String[] arr = {"김호석", "김해민", "도경진", "유송우"};

        li = new JList(arr);
        cb = new JComboBox(arr);

        btn = new JButton("확인");
        btn.addActionListener(btnLsnr);
        add(li);
        add(cb);
        add(btn);

        setVisible(true);
    }

    private ActionListener btnLsnr = e -> {
        String liSelected = li.getSelectedValue().toString();
        String cbSelected = cb.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, liSelected+'\n'+cbSelected);
    };

    public static void main(String[] args) {
        new Code12_11_List_ComboBox();
    }
}
