package chapter12_JFrame.exam07_draw;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Code12_29_MainFrame extends JFrame {
    Code12_30_PaintingPanel panel;
    String[] polygonStrs = {"선", "사각형", "타원"};
    JRadioButton[] rbs = new JRadioButton[polygonStrs.length];

    Code12_29_MainFrame() {
        setTitle("User Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(700, 700);
        cf.centerPoint();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());

        JPanel panelNorth = new JPanel();

        ButtonGroup group = new ButtonGroup();

        for (int i=0; i<rbs.length; i++) {
            rbs[i] = new JRadioButton(polygonStrs[i]);
            group.add(rbs[i]);
            rbs[i].addActionListener(actionLsnr);
            panelNorth.add(rbs[i]);
        }
        rbs[0].setSelected(true);

        add(panelNorth, "North");

        panel = new Code12_30_PaintingPanel("선");
        add(panel);

        setVisible(true);

    }

    private ActionListener actionLsnr = e -> {
        String polygon = e.getActionCommand();

        panel.setPolygon(polygon);
        panel.repaint();
    };

    public static void main(String[] args) {
        new Code12_29_MainFrame();
    }
}
