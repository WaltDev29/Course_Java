package chapter12_JFrame.exam05_menu;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Code12_23_Menu extends JFrame {
    JLabel lbl;
    JMenuItem miNew;
    JMenuItem miOpen;
    JMenuItem miClose;

    Code12_23_Menu() {
        setTitle("Menu");
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

        lbl = new JLabel("이곳이 바뀝니다.",JLabel.CENTER);
        add(lbl);



        setVisible(true);
    }

    private ActionListener menuListener = e -> {
        JMenuItem mi = (JMenuItem) e.getSource();
        if (mi == miNew) {
            lbl.setText("[새문서] 메뉴 항목을 선택했습니다.");
        } else if (mi == miOpen) {
            lbl.setText("[열기] 메뉴 항목을 선택했습니다.");
        } else if (mi == miClose) {
            System.exit(0);
        }
    };

    public static void main(String[] args) {
        new Code12_23_Menu();
    }
}
