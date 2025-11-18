package chapter12_JFrame.exam08_lab;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {
    PaintingPanel panel;
    String[] polygonStrs = {"선", "사각형", "타원"};
    JRadioButton[] rbs = new JRadioButton[polygonStrs.length];

    String polygon = "선";
    int x1,y1,x2,y2 = 0;

    public MainFrame() {
        setTitle("Lab");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        JPanel rbPanel = new JPanel();
        ButtonGroup group = new ButtonGroup();

        for (int i=0; i<rbs.length; i++) {
            rbs[i] = new JRadioButton(polygonStrs[i]);
            rbs[i].addActionListener(rbLsnr);
            group.add(rbs[i]);
            rbPanel.add(rbs[i]);
        }
        rbs[0].setSelected(true);

        add(rbPanel, "North");

        panel = new PaintingPanel("선");
        panel.addMouseListener(mouseLsnr);
        add(panel);

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
            panel.setPolygon(polygon);
            panel.setPoints(x1,y1,x2,y2);
            panel.repaint();
        }
    };

    private ActionListener rbLsnr = e -> polygon = e.getActionCommand();

    public static void main(String[] args) {
        new MainFrame();
    }
}
