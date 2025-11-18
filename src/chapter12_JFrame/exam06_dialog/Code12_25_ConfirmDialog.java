package chapter12_JFrame.exam06_dialog;

import center_frame.CenterFrame;

import javax.swing.*;

public class Code12_25_ConfirmDialog extends JFrame {
    Code12_25_ConfirmDialog() {
        setTitle("Confirm Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        setVisible(true);

        int option = JOptionPane.showConfirmDialog(null, "버튼을 선택해 주세요.", "ConfirmDialog", JOptionPane.YES_NO_OPTION);

        // 향상된 swtich case문 연습
        String message = switch(option) {
            case JOptionPane.YES_OPTION -> "Yes";
            case JOptionPane.NO_OPTION -> "No";
            case JOptionPane.CANCEL_OPTION -> "Cancel";
            default -> "";
        };

        JOptionPane.showMessageDialog(null, message + "버튼을 선택하셨습니다.");
    }

    public static void main(String[] args) {
        new Code12_25_ConfirmDialog();
    }
}
