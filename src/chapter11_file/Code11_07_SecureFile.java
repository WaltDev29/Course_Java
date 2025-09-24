package chapter11_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Code11_07_SecureFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        String line = "";
        String secureOutStr;

        try {
            fw = new FileWriter(new File("D:/course/java/fileTest/security.txt"));
            System.out.print("텍스트를 입력하세요 (q : 종료) : ");

            while (true) {
                line = sc.nextLine();
                secureOutStr = "";
                if (line.equalsIgnoreCase("q")) break;

                for (int i=0; i<line.length(); i++) {
                    int code = line.charAt(i);
                    code += 100;
                    secureOutStr += (char)code;
                }

                System.out.println("원본 : " + line);
                System.out.println("암호화 내용 : " + secureOutStr);
                fw.write(secureOutStr + '\n');
            }
            System.out.println("파일 쓰기 완료");

        } catch(FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽지 못했습니다.");
        }

        try {
            fw.close();
            System.out.println("파일을 닫았습니다.");
            sc.close();
        } catch (IOException e) {
            System.out.println("파일 닫기에 문제가 발생하였습니다.");
        }
    }
}
