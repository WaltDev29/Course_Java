package chapter12_JFrame;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Code12_08_RadioButton extends JFrame {
    ArrayList<JRadioButton> radioBtns = new ArrayList<>();
    String[] rbStrArr = {"밥","빵","떡","면"};
    ButtonGroup grp;
    public Code12_08_RadioButton() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Radio Button Test");

        CenterFrame cf = new CenterFrame(500, 300);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setLayout(new FlowLayout());

        grp = new ButtonGroup();
        for (int i=0; i<rbStrArr.length; i++) {
            radioBtns.add(new JRadioButton(rbStrArr[i]));
            add(radioBtns.get(i));
            grp.add(radioBtns.get(i));
        }

        JButton btn = new JButton("확인");
        btn.addActionListener(actionLsnr);
        add(btn);

        setVisible(true);
    }

    private ActionListener actionLsnr = e -> {
        for (JRadioButton rb : radioBtns) {
            if (rb.isSelected()) JOptionPane.showMessageDialog(null, rb.getText() + "을 선택했습니다.");
        }
    };

    public static void main(String[] args) {
        new Code12_08_RadioButton();
    }
}
