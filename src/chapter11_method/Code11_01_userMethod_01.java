package chapter11_method;

public class Code11_01_userMethod_01 {
    public static void main(String[] args) {
        rollDice("호석");
        rollDice("형원");
        rollDice("도훈");
    }

    public static void rollDice(String name) {
        int[] dice = {1,2,3,4,5,6};
        System.out.printf("%s님의 주사위를 굴립니다.\n", name);
        System.out.printf("결과 : %d\n\n", dice[(int)(Math.random() * 6)]);
    }
}
