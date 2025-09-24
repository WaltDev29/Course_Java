package chapter11_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Code11_06_CopyImage {
    public static void main(String[] args) {
        // 이미지는 1byte씩 읽고 써야 하기 때문에 InputStream, OutputStream 계열을 사용
        // (byte단위 Stream)
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:/course/java/fileTest/Cat.png");
            fos = new FileOutputStream("D:/course/java/fileTest/copiedCat.png");

            int ch;
            while ((ch = fis.read()) != -1)
                fos.write(ch);
            System.out.println("복사가 완료되었습니다.");
        } catch(FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽지 못했습니다.");
        }

        try {
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("파일 닫기에 문제가 발생했습니다.");
        }
    }
}
