package chapter11_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Code11_02_ReadFile {
    // throws를 사용한 방식
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:/course/javaFileTest/myData1.txt"));

            String line;
        int i = 1;
        while ((line = br.readLine()) != null) {
            System.out.println(i+". "+line);
            i++;
        }

        br.close();
    }
}
