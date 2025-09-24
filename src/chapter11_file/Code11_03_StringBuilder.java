package chapter11_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Code11_03_StringBuilder {
    // try-with-resources를 사용한 방식
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("D:/course/java/fileTest/myData1.txt"))) {
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                sb.append(line + '\n');
            }
        } catch (FileNotFoundException e) {
            System.out.println("해당 경로에서 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽어올 수 없습니다.");
        }

        sb.reverse();   // 거꾸로 출력해보기 위해 reverse
        System.out.println(sb);
    }
}
