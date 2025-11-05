package chapter12_JFrame.exam05_menu;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Lab extends JFrame {
    JLabel lbl;
    JMenuItem miNew;
    JMenuItem miOpen;
    JMenuItem miClose;
    JButton btnNew;
    JButton btnOpen;
    JButton btnClose;

    Lab() {
        setTitle("Menu + ToolBar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CenterFrame cf = new CenterFrame(500,500);
        cf.centerPoint();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());

        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu mFile = new JMenu("파일");
        JMenu mEdit = new JMenu("편집");
        mb.add(mFile);
        mb.add(mEdit);
        miNew = new JMenuItem("새문서");
        miOpen = new JMenuItem("열기");
        miClose = new JMenuItem("닫기");

        miNew.addActionListener(menuListener);
        miOpen.addActionListener(menuListener);
        miClose.addActionListener(menuListener);

        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.add(miClose);

        JToolBar toolbar = new JToolBar();
        add(toolbar, BorderLayout.NORTH);

        btnNew = new JButton(new ImageIcon(getClass().getResource("../imgs/icon_new.png")));
        btnOpen = new JButton(new ImageIcon(getClass().getResource("../imgs/icon_open.png")));
        btnClose = new JButton(new ImageIcon(getClass().getResource("../imgs/icon_close.png")));

        btnNew.addActionListener(menuListener);
        btnOpen.addActionListener(menuListener);
        btnClose.addActionListener(menuListener);

        toolbar.add(btnNew);
        toolbar.addSeparator();
        toolbar.add(btnOpen);
        toolbar.addSeparator();
        toolbar.add(btnClose);

        lbl = new JLabel("이곳이 바뀝니다.",JLabel.CENTER);
        add(lbl);



        setVisible(true);
    }

    private ActionListener menuListener = e -> {
        JButton btn = null;
        JMenuItem mi = null;
        if (e.getSource() instanceof JButton) btn = (JButton) e.getSource();
        if (e.getSource() instanceof JMenuItem) mi = (JMenuItem) e.getSource();

        if (btn == btnNew || mi == miNew) lbl.setText("[새문서] 메뉴 항목을 선택했습니다.");
        else if (btn == btnOpen || mi == miOpen) lbl.setText("[열기] 메뉴 항목을 선택했습니다.");
        else if (btn == btnClose || mi == miClose) System.exit(0);
    };

    public static void main(String[] args) {
        new Lab();
    }
}
