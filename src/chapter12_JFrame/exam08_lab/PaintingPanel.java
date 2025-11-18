package chapter12_JFrame.exam08_lab;

import javax.swing.*;
import java.awt.*;

public class PaintingPanel extends JPanel {
    private String polygon;
    private int x1,y1,x2,y2;

    public PaintingPanel(String polygon) {
        this.polygon = polygon;
    }



    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }

    public void setPoints(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (this.polygon) {
            case "선" :
                g.setColor(Color.GREEN);
                g.drawLine(this.x1,this.y1,this.x2,this.y2);
                break;

            case "사각형" :
                g.setColor(Color.RED);
                g.fillRect(Math.min(this.x1, this.x2),Math.min(this.y1, this.y2),Math.abs(this.x2-this.x1),Math.abs(this.y2-this.y1));
                break;

            case "타원" :
                g.setColor(Color.BLUE);
                g.fillOval(Math.min(this.x1, this.x2),Math.min(this.y1, this.y2),Math.abs(this.x2-this.x1),Math.abs(this.y2-this.y1));
                break;
        }
    }
}
