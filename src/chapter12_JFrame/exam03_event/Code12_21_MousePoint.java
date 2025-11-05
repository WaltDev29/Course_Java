package chapter12_JFrame.exam03_event;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Code12_21_MousePoint extends JFrame {
    JLabel lblX = new JLabel("X좌표 : ");
    JLabel lblY = new JLabel("Y좌표 : ");
    JTextField txtX;
    JTextField txtY;

    Code12_21_MousePoint() {
        setTitle("Mouse Point");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());
        setLayout(new FlowLayout());


        txtX = new JTextField(5);
        txtY = new JTextField(5);
        add(lblX);
        add(txtX);
        add(lblY);
        add(txtY);

        addMouseListener(mouseLsnr);

        setVisible(true);
    }

    private MouseAdapter mouseLsnr = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            txtX.setText(Integer.toString(e.getX()));
            txtY.setText(Integer.toString(e.getY()));
        }
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            txtX.setText("");
            txtY.setText("");
        }
    };

    public static void main(String[] args) {
        new Code12_21_MousePoint();
    }
}
