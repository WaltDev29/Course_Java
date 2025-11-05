package chapter12_JFrame.exam04_draw;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class Code12_22_Draw extends JFrame {
    Code12_22_Draw() {
        DrawPanel dp = new DrawPanel();

        setTitle("Mouse Point");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        add(dp);

        setVisible(true);
    }

    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // 색 설정
            g.setColor(Color.BLUE);
            // 선
            g.drawLine(10,20,480,20);
            g.setColor(Color.RED);
            // 타원
            g.drawOval(20,30,150,100);
            g.fillOval(200,30,150,100);
            g.setColor(Color.ORANGE);
            g.fillOval(370,30,100,100);
            g.setColor(Color.GREEN);
            g.drawRect(20,160,200,150);
            g.setColor(Color.PINK);
            g.fillRect(250,160,200,200);
            g.setColor(Color.YELLOW);
            g.fillRoundRect(300,210,100,100,20,20);
            g.setColor(Color.BLACK);
            int[] xPoints = {100,30,170};
            int[] yPoints = {180,300,300};
            g.drawPolygon(xPoints, yPoints, xPoints.length);
        }
    }
    public static void main(String[] args) {
        new Code12_22_Draw();
    }
}
