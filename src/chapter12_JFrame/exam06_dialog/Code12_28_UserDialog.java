package chapter12_JFrame.exam06_dialog;

import center_frame.CenterFrame;

import javax.swing.*;

public class Code12_28_UserDialog extends JFrame {
    Code12_28_UserDialog() {
        setTitle("User Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(300, 300);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        setVisible(true);

        String[] strOptions = {"밥", "빵", "면"};
        int option = JOptionPane.showOptionDialog(
                null,
                "먹고 싶은 음식을 선택해주세요",
                "메뉴 선택",
                JOptionPane.OK_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                strOptions,
                strOptions[0]
                );

        JOptionPane.showMessageDialog(null, strOptions[option] + " 맛있겠다.", "선택한 메뉴", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        new Code12_28_UserDialog();
    }
}
