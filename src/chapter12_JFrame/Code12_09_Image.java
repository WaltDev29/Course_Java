package chapter12_JFrame;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Code12_09_Image extends JFrame {
    ArrayList<JRadioButton> rbBtnList = new ArrayList<>();
    String[] rbStrArr = {"밥", "빵", "면", "떡"};
    String[] imgNameArr = {"rice", "bread", "noodle", "dduck"};
    JLabel lbl;
    public Code12_09_Image() {
        setTitle("Image Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        ImageIcon icon1 = new ImageIcon("D:\\course\\java\\src\\chapter12_JFrame\\imgs\\" + imgNameArr[0] + ".png");

        lbl = new JLabel(icon1);
        lbl.setOpaque(true);
        lbl.setBackground(Color.WHITE);
        add(lbl, "North");

        JPanel panel = new JPanel();
        ButtonGroup grp = new ButtonGroup();
        for (int i=0; i<rbStrArr.length; i++) {
            rbBtnList.add(new JRadioButton(rbStrArr[i]));
            panel.add(rbBtnList.get(i));
            grp.add(rbBtnList.get(i));
        }
        add(panel, "Center");

        JButton btn = new JButton("확인");
        btn.addActionListener(actionLsnr);
        add(btn,"South");

        setVisible(true);
    }

    private ActionListener actionLsnr = e -> {
        for (int i=0; i<rbBtnList.size(); i++) {
            if (rbBtnList.get(i).isSelected()) {
                ImageIcon icon = new ImageIcon("D:\\course\\java\\src\\chapter12_JFrame\\imgs\\" + imgNameArr[i] + ".png");
                lbl.setIcon(icon);
            }
        }
    };

    public static void main(String[] args) {
        new Code12_09_Image();
    }
}
