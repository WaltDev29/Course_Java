package chapter11_file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Code_11_04_WriteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("D:/course/javaFileTest/myData2.txt")) {
            System.out.println("저장할 내용을 입력하세요. (q : 종료)");
            String line = "";
            while (true) {
                line = sc.nextLine();
                if (line.equalsIgnoreCase("q")) break;
                fw.write(line + '\n');
            }
        } catch (IOException e) {
            System.out.println("파일 처리에 문제가 발생했습니다.");
        }
    }
}