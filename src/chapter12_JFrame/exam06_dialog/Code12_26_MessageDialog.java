package chapter12_JFrame.exam06_dialog;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Code12_26_MessageDialog extends JFrame {
    String[] btnStrs = {"Plain", "Warning", "Information"};
    JButton[] btns = new JButton[btnStrs.length];

    Code12_26_MessageDialog() {
        setTitle("Message Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        JPanel panel = new JPanel();
        add(panel, "North");

        for (int i=0; i<btnStrs.length; i++) {
            btns[i] = new JButton(btnStrs[i]);
            btns[i].addActionListener(actionLsnr);
            panel.add(btns[i]);
        }

        setVisible(true);
    }

    ActionListener actionLsnr = e -> {
        String eBtnStr = e.getActionCommand();

        switch (eBtnStr) {
            case "Plain":
                JOptionPane.showConfirmDialog(null,"일반메시지 대화상자입니다.", "Plain Option", JOptionPane.PLAIN_MESSAGE);
                break;
            case "Warning":
                JOptionPane.showConfirmDialog(null,"경고메시지 대화상자입니다.", "Warning Option", JOptionPane.WARNING_MESSAGE);
                break;
            case "Information":
                JOptionPane.showConfirmDialog(null,"정보메시지 대화상자입니다.", "Information Option", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    };



    public static void main(String[] args) {
        new Code12_26_MessageDialog();
    }
}
