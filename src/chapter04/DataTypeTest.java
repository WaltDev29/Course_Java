package chapter04;

public class DataTypeTest {
    public static void main(String[] args) {
        // 숫자가 아닌 자료형 : bloolean, char
        boolean boo1 = false;
        boolean boo2 = 100 > 200; // false
        boolean boo3 = !boo1; // true

        char ch1 = 'A';
        char ch2 = 97;
        char ch3 = 'A' + 1;

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        System.out.println("ch1 + 3 : " + (char)(ch1 + 3)); // 정수형을 char형으로 형변환 해서 출력

        // 숫자 자료형 : 정수형, 실수형
        // 정수형 : byte, short, int ,long
//        byte byte1 = 128;   // overflow로 인한 에러
//        byte byte2 = -129;  // underflow로 인한 에러
        byte byte3 = 127;
        byte byte4 = byte3;
        System.out.println("byte3 = " + byte3);
        System.out.println("byte4 = " + byte4);

        short short1 = 128;
        short short2 = byte3;
//        byte4 = short1 -1;  // byte보다 크기가 큰 short 자료형을 대입하려고 해서 error

        int int1 = byte3;
        int int2 = short1;
        int int3 = 1000000000;

        long long1 = byte3;
        long long2 = short1;
        long long3 = int1;
        long long4 = (long)Math.pow(10, 15);   // Math.pow는 실수형으로 반환됨

        System.out.println("long4 = " + long4);

        // 실수형 : float, double
        float float1 = 123.456f;    // double형을 float형으로 형변환
        float float2 = (float)123.456;  // 캐스팅 연산자 (형변환 연산자)
        float float3 = short1;  // 정수형 대입 가능
        float float4 = 100;

        double double1 = 123.456;
        double double2 = float1;
        double double3 = byte3; // 정수형도 대입 가능
        double double5 = 333;
        double double4 = long3; // long형도 대입 가능

        // 참조형 : 클래스, 인터페이스
        String str1 = new String("hello");  // 자바에서는 스트링이 클래스다!!
        str1 = "polytech";    // 직접 대입도 가능
        String str2 = new String("polytech");

        boolean boo4 = str1 == str2;    // 주소값을 비교하는 것이기 때문에 false
        boolean boo5 = str1.equals(str2);   // 이렇게 비교해야 함
        System.out.println("str1 == str2 : " + boo4);
        System.out.println("str1.equals(str2) : " + boo5);
    }
}
