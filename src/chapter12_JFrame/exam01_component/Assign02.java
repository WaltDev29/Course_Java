package chapter12_JFrame.exam01_component;

import javax.swing.*;
import java.awt.*;

public class Assign02 extends JFrame {
    public Assign02() {
        // Toolkit : 시스템 리소스 접근 도구
        // Toolkit.getDefaultToolkit() : 현재 운영체제의 기본 툴킷 객체 반환
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Dimension : width,height 두 개의 필드를 가진 객체
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int fw = 500;
        int fh = 300;
        int x = (screenWidth/2) - (fw/2);
        int y = (screenHeight/2) - (fh/2);

        setTitle("Assign02");
        setBounds(x,y,fw,fh);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Assign02();
    }
}
