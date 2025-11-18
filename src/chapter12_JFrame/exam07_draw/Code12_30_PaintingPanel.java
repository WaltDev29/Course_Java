package chapter12_JFrame.exam07_draw;

import javax.swing.*;
import java.awt.*;

public class Code12_30_PaintingPanel extends JPanel {
    public String polygon;

    public Code12_30_PaintingPanel(String polygon) {
        this.polygon = polygon;
        setBackground(Color.WHITE);
    }

    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch(this.polygon) {
            case "선":
                g.setColor(Color.RED);
                g.drawLine(30,30,100,50);
                break;
            case "사각형":
                g.setColor(Color.GREEN);
                g.drawRect(50,70,200,200);
                break;
            case "타원":
                g.setColor(Color.BLUE);
                g.drawOval(220,150,200,300);
                break;
        }
    }
}
