package chapter11_exception;

import java.io.*;

public class Code11_03_ThrowsTest {
    // 메서드를 호출한 메서드에 예외처리를 맡김
    public static void copyFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new FileReader("D:/course/java/fileTest/myData2.txt"));
        FileWriter fw = new FileWriter("D:/course/java/fileTest/copiedData1.txt");
        String line;
        while ((line = bf.readLine()) != null) {
            sb.append(line).append('\n');
        }
        fw.write(sb.toString());
        System.out.println("복사가 완료되었습니다.");
    }


    public static void main(String[] args) {
        // copyFile 메서드의 예외를 받아서 처리해줘야 함
        try {
            copyFile();
        } catch(FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽지 못했습니다.");
        }
    }
}
