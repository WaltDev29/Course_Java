package chapter12_JFrame.exam03_event;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Code12_19_MouseEvent extends JFrame {
    Code12_19_MouseEvent() {
        setTitle("Mouse Event");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(200,200);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        addMouseListener(mouseLsnr);

        setVisible(true);
    }

    private MouseListener mouseLsnr = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
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

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };

    public static void main(String[] args) {
        new Code12_19_MouseEvent();
    }
}
