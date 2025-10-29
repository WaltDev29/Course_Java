package chapter12_JFrame.exam01_component;

import javax.swing.*;
import java.awt.*;

// JFrame의 기본 LayoutManager(배치관리자) : BorderLayout(동,서,남,북,중앙에 배치)
public class Code12_04_FlowLayout extends JFrame {
    public Code12_04_FlowLayout() {
        setTitle("JFrame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setBounds = setLocation(x,y) + setSize(width,height)
        setBounds(100,100,300,300);

        setLayout(new FlowLayout());

        // Label 생성 (반복문으로 간단하게)
        String[] lblTexts = {"한국폴리텍","서울정수","인공지능소프트웨어"};
        JLabel[] lbls = new JLabel[lblTexts.length];
        Color[] lblBgColors = {Color.red, Color.blue, Color.green};
        for (int i=0; i< lblTexts.length; i++) {
            lbls[i] = new JLabel(lblTexts[i]);
            lbls[i].setOpaque(true);    // 배경을 불투명하게 함. 기본적으로 투명함.
            lbls[i].setBackground(lblBgColors[i]);
            lbls[i].setForeground(Color.white); // Font Color 설정
            add(lbls[i]);
        }
        // Font를 적용하기 위한 객체를 생성
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        lbls[2].setFont(font);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Code12_04_FlowLayout();
    }
}
