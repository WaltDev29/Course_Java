package chapter12_JFrame;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Assign03 extends JFrame {
    JPanel panel;
    JComboBox cb;
    JButton btn;
    JLabel lbl;
    JLabel imgLbl;
    ImageIcon imgIcon;
    
    String[] foods = {"빵","떡","면","밥"};
    String[] imgNameArr = {"bread", "dduck", "noodle", "rice"};

    public Assign03() {
        setTitle("Assign03");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());
        
        panel = new JPanel();
        cb = new JComboBox(foods);
        btn = new JButton("선택");
        btn.addActionListener(btnLsnr);
        imgIcon = new ImageIcon(getClass().getResource("/chapter12_JFrame/imgs/"+imgNameArr[0]+".png"));
        lbl = new JLabel("Food : ");
        imgLbl = new JLabel(imgIcon);

        panel.add(lbl);
        panel.add(cb);
        panel.add(btn);
        add(panel, "North");
        add(imgLbl,"Center");

        setVisible(true);
    }

    private ActionListener btnLsnr = e -> {
        int index = cb.getSelectedIndex();
//        JOptionPane.showMessageDialog(null, index);
        imgIcon = new ImageIcon(getClass().getResource("/chapter12_JFrame/imgs/"+imgNameArr[index]+".png"));
        imgLbl.setIcon(imgIcon);
    };

    public static void main(String[] args) {
        new Assign03();
    }
}
