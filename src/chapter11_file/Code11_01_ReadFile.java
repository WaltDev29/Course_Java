package chapter11_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Code11_01_ReadFile {
    // try-catch를 이용한 방식
    public static void main(String[] args) {
        // checked exception : 사용하기 전에 유효성을 검사해야 하는 예외
        // unchecked exception : 사용하기 전에 유효성을 검사하지 않아도 되는 예외
        // FileReader는 checked exception

        String line;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:/course/javaFileTest/myData1.txt"));

            while (true) {
                line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("해당 경로에서 파일을 찾을 수 없습니다.");
            return;
        } catch (IOException e) {
            System.out.println("파일을 읽어올 수 없습니다.");
            return;
        }


        // 이것도 checked exception
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("BufferedReader를 닫는데 문제가 발생했습니다.");
        }
    }
}
