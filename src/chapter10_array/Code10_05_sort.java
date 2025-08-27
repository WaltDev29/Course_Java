package chapter10_array;

import java.util.Arrays;
import java.util.Collections;

public class Code10_05_sort {
    public static void main(String[] args) {
        int[] arr1 = {1,8,6,7,5,4,3,2,9};

        // Arrays.sort
        System.out.print("정렬 전 배열 : ");
        for (int data : arr1) {
            System.out.printf("%d ", data);
        }
        System.out.println();

        // ASC
        Arrays.sort(arr1);
        System.out.print("정렬 후 배열 : ");
        for (int data : arr1) {
            System.out.printf("%d ", data);
        }

        // DSC
        String[] arr2 = {"인공지능", "소프트웨어", "한국", "대학", "폴리텍", "1학년", "2학년"};

        System.out.print("정렬 전 배열 : ");
        for (String data : arr2) {
            System.out.printf("%s ", data);
        }
        System.out.println();

        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.print("정렬 후 배열 : ");
        for (String data : arr2) {
            System.out.printf("%s ", data);
        }
    }
}
