package chapter11_file;

import java.io.*;

public class Code11_05_CopyFile {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader bf = new BufferedReader(new FileReader("D:/course/java/fileTest/myData2.txt"));
            FileWriter fw = new FileWriter("D:/course/java/fileTest/copiedData1.txt")) {
            String line;
            while ((line = bf.readLine()) != null) {
                sb.append(line).append('\n');
            }
            fw.write(sb.toString());
            System.out.println("복사가 완료되었습니다.");
        } catch(FileNotFoundException e) {
            System.out.println("해당 경로에서 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽어올 수 없습니다.");
        }
    }
}
