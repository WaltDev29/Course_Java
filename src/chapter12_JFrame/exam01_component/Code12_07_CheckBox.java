package chapter12_JFrame.exam01_component;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Code12_07_CheckBox extends JFrame {
    JCheckBox checkBox;

    public Code12_07_CheckBox() {
        setTitle("CheckBox Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        // 모니터 화면 정중앙에 오도록 하려 함.
        CenterFrame cf = new CenterFrame(500, 300);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        checkBox = new JCheckBox("체크박스를 선택하세요.");

        checkBox.addActionListener(actionLsnr);
        add(checkBox);

        setVisible(true);
    }

    ActionListener actionLsnr = e -> {
        if (checkBox.isSelected()) JOptionPane.showMessageDialog(null, "체크되었습니다.");
        else JOptionPane.showMessageDialog(null, "체크가 해제되었습니다.");
    };

    public static void main(String[] args) {
        new Code12_07_CheckBox();
    }
}
