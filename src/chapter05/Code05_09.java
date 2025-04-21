package chapter05;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;
import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("현재요일 번호 : " + day);
        char dayCh = 0;

        switch(day) {
            case Calendar.SUNDAY:
                dayCh = '일';
                break;
            case Calendar.MONDAY:
                dayCh = '월';
                break;
            case Calendar.TUESDAY:
                dayCh = '화';
                break;
            case Calendar.WEDNESDAY:
                dayCh = '수';
                break;
            case Calendar.THURSDAY:
                dayCh = '목';
                break;
            case Calendar.FRIDAY:
                dayCh = '금';
                break;
            case Calendar.SATURDAY:
                dayCh = '토';
                break;
            default:
                break;
        }

        System.out.println("오늘은 " + dayCh + "요일입니다.");
    }
}
