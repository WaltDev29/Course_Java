package chapter11_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DecodingSecureFileTest {
    public static void main(String[] args) {
        BufferedReader bf = null;
        String line;
        String decodingStr = "";

        try {
            bf = new BufferedReader(new FileReader("D:/course/java/fileTest/security.txt"));

            while ((line = bf.readLine()) != null) {
                for (int i=0; i<line.length(); i++)
                    decodingStr += (char)(line.charAt(i) -100);

                decodingStr += '\n';
            }
            System.out.println("파일 해독 완료\n");
            System.out.println("=== 원본 내용 ===");
            System.out.println(decodingStr);

        } catch(FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽지 못했습니다.");
        }

        try {
            bf.close();
            System.out.println("파일 닫기 완료");
        } catch (IOException e) {
            System.out.println("파일 닫기에 문제가 발생하였습니다.");
        }
    }
}
