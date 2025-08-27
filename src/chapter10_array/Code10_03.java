package chapter10_array;

public class Code10_03 {
    public static void main(String[] args) {

        // 동적 배열 할당 1
        int[][] arr = {
                {1,2},
                {3,4,5},
                {6}
        };

        // 동적 배열 할당 2
//        int[][] arr = new int[3][];
//        arr[0] = new int[]{1, 2};
//        arr[1] = new int[]{3, 4, 5};
//        arr[2] = new int[]{6};

        // 동적 배열 출력 1
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d ",arr[i][j]);
//            }
//            System.out.println();
//        }

        // 동적 배열 출력 2
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d] : %d\n", i,j,arr[i][j]);
            }
            System.out.println();
        }
    }
}
