package chapter12_JFrame.exam06_dialog;

import center_frame.CenterFrame;

import javax.swing.*;

public class Code12_27_InputDialog extends JFrame {
    Code12_27_InputDialog() {
        setTitle("Input Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        setVisible(true);
        
        String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.", "John Doe");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "나이를 입력하세요.", "20"));
        JOptionPane.showMessageDialog(null, "이름 : " + name + "\n나이 : " + age);
    }

    public static void main(String[] args) {
        new Code12_27_InputDialog();
    }
}
