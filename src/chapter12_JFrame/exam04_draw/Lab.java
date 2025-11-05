package chapter12_JFrame.exam04_draw;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lab extends JFrame {
    int x1, y1, x2, y2;
    DrawLine dl = new DrawLine();

    Lab() {
        setTitle("Mouse Point");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        dl.addMouseListener(mouseLsnr);
        add(dl);

        setVisible(true);
    }

    private MouseAdapter mouseLsnr = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            x1 = e.getX();
            y1 = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            x2 = e.getX();
            y2 = e.getY();
            dl.repaint();
        }
    };


    class DrawLine extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawLine(x1,y1,x2,y2);
        }
    }

    public static void main(String[] args) {
        new Lab();
    }
}
