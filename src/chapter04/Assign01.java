package chapter04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjectCount;   // 과목 개수

        System.out.println("\n### 학점 계산기 ###\n");
        // 과목 수 입력 받기
        while(true) {
            try {
                System.out.print("총 수강 과목 수를 입력해주세요 : ");
                subjectCount = sc.nextInt();
                if (subjectCount <= 0) {
                    System.out.println("\n* 1 이상의 숫자를 입력해주세요\n");
                    sc.nextLine();
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n* 1 이상의 숫자를 입력해주세요\n");
                sc.nextLine();
            }
        }

        // 관련 변수 선언
        String[] subjects = new String[subjectCount];  // 과목
        int[] credits = new int[subjectCount];         // 이수학점
        float[] grade = new float[subjectCount];       // 성적
        float gpa;              // 평균학점
        float totalCredit = 0;  // 총 이수학점
        float totalGrade = 0;   // 과목별 (성적 * 이수학점)의 총합

        // 성적 입력 받기
        System.out.println("\n과목별로 과목, 이수학점, 성적을 입력해주세요.");
            for (int i = 0; i < subjectCount; i++) {
                try {
                    System.out.printf("## %d번째 과목 ##\n", i + 1);
                    System.out.print("과목을 입력해주세요 : ");
                    subjects[i] = sc.next();
                    System.out.print("이수학점을 입력해주세요 : ");
                    credits[i] = sc.nextInt();
                    if (credits[i] <= 0) {
                        System.out.println("\n* 이수학점은 1 이상이어야 합니다.");
                        System.out.println("* 과목부터 다시 입력해주세요.\n");
                        i--;
                        continue;
                    }
                    System.out.print("성적을 입력해주세요 (0.0~4.5) : ");
                    grade[i] = sc.nextFloat();
                    System.out.println();
                    if (grade[i] < 0.0f || grade[i] > 4.5f) {
                        System.out.println("* 성적은 0.0 ~ 4.5 사이로 입력해주세요.");
                        System.out.println("* 과목부터 다시 입력해주세요.\n");
                        i--;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n* 잘못된 값을 입력했습니다.");
                    System.out.println("* 과목부터 다시 입력해주세요.\n");
                    sc.nextLine();
                    i--;
                }
            }

        // 평균학점 계산
        for (int i = 0; i < subjectCount; i++) {
            totalGrade += grade[i] * credits[i];
            totalCredit += credits[i];
        }
        gpa = totalGrade / totalCredit;

        // 결과 출력
        System.out.println("*** 결과 ***");
        for (int i = 0; i < subjectCount; i++) {
            System.out.println("\n과목 : " + subjects[i]);
            System.out.println("이수학점 : " + credits[i]);
            System.out.println("성적 : " + grade[i]);
        }
        System.out.printf("\n### [ 평균학점 : %.2f점 ] ###", gpa);
        sc.close();
    }
}
