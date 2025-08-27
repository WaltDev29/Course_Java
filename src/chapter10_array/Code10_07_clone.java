package chapter10_array;

import java.util.Arrays;

public class Code10_07_clone {
    public static void main(String[] args) {
        // 배열의 주소 복사
        // 기존 arr2 배열은 JVM의 Garbage Collection 대상이 되어
        // 언젠가 메모리에서 자동 회수됨.
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        arr2 = arr1;

        arr1[0] = 10;
        arr2[1] = 50;
        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));
        
        // 배열의 값 복사
        String[] originArr = {"호석", "동경", "경진", "해민", "재영", "종민"};
        String[] cloneArr = originArr.clone();

        originArr[0] = "혜수";

        System.out.println("originArr : " + Arrays.toString(originArr));
        System.out.println("cloneArr : " + Arrays.toString(cloneArr));
    }
}
