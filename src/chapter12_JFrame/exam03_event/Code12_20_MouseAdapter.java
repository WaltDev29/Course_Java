package chapter12_JFrame.exam03_event;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Code12_20_MouseAdapter extends JFrame {
    Code12_20_MouseAdapter() {
        setTitle("Mouse Event");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(200,200);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        addMouseListener(mouseLsnr);

        setVisible(true);
    }

    private MouseAdapter mouseLsnr = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            String message;
            switch (e.getButton()) {
                case MouseEvent.BUTTON1 :
                    message = "왼쪽 ";
                    break;
                case MouseEvent.BUTTON2 :
                    message = "가운데 ";
                    break;
                case MouseEvent.BUTTON3 :
                    message = "오른쪽 ";
                    break;
                default:
                    message = "None";
            }
            JOptionPane.showMessageDialog(null,message + " 버튼을 클릭했습니다.");
        }
    };

    public static void main(String[] args) {
        new Code12_20_MouseAdapter();
    }
}
