package chapter12_JFrame.exam05_menu;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Code12_24_ToolBar extends JFrame {
    JButton btnNew;
    JButton btnOpen;
    JButton btnClose;
    JLabel lbl;

    Code12_24_ToolBar() {
        setTitle("ToolBar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        JToolBar toolbar = new JToolBar();
        add(toolbar, BorderLayout.NORTH);

        btnNew = new JButton(new ImageIcon(getClass().getResource("../imgs/icon_new.png")));
        btnOpen = new JButton(new ImageIcon(getClass().getResource("../imgs/icon_open.png")));
        btnClose = new JButton(new ImageIcon(getClass().getResource("../imgs/icon_close.png")));

        btnNew.addActionListener(menuLsnr);
        btnOpen.addActionListener(menuLsnr);
        btnClose.addActionListener(menuLsnr);

        toolbar.add(btnNew);
        toolbar.addSeparator();
        toolbar.add(btnOpen);
        toolbar.addSeparator();
        toolbar.add(btnClose);

        lbl = new JLabel("이곳이 바뀝니다.", JLabel.CENTER);
        add(lbl);
        setVisible(true);
    }

    private ActionListener menuLsnr = e -> {
        JButton btn = (JButton) e.getSource();
        if (btn == btnNew) lbl.setText("[새파일] 메뉴를 선택했습니다.");
        else if (btn == btnOpen) lbl.setText("[열기] 메뉴를 선택했습니다.");
        else if (btn == btnClose) System.exit(0);
    };

    public static void main(String[] args) {
        new Code12_24_ToolBar();
    }
}
