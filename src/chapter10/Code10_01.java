package chapter10;

public class Code10_01 {
    public static void main(String[] args) {
        // 1차원 배열 초기화 방법 2가지
        // 1.
        int arr1[] = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i=0; i<arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        System.out.println();

        // 2.
        int[] arr2 = {1,2,3,4};
        for (int i=0; i<arr2.length; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
        System.out.println();

        // 2차원 배열 (자바의 배열은 기본적으로 동적배열)
        int a = 2;
        int b = 3;
        int num = 1;
        int arr3[][] = new int[a][b];
        for (int i=0; i<arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = num++;
                System.out.printf("arr3[%d][%d] : %d\n",i,j,arr3[i][j]);
            }
        }
        System.out.println();
        
        // 1차원 배열 각 인덱스에 다른 크기의 배열 넣기
        num = 1;
        int arr4[][] = new int[3][];
        for (int i=0; i<arr4.length; i++) {
            arr4[i] = new int[i+1];
            for (int j=0; j<arr4[i].length; j++) {
                arr4[i][j] = num++;
                System.out.printf("arr4[%d][%d] : %d\n",i,j,arr4[i][j]);
            }
            System.out.println();
        }
    }
}
