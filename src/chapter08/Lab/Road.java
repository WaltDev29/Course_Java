package chapter08.Lab;

import java.util.Scanner;

public class Road {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car bus = new SchoolBus("스쿨버스");
        Car car = new SportsCar("스포츠카");

        int speed = 0;
        while(true) {
            System.out.print("가속할 속도 : ");
            speed = sc.nextInt();

            if (speed == -1) break;

            bus.speedUp(speed);
            car.speedUp(speed);
        }
        System.out.println("자동차가 멈춥니다.");
        sc.close();
    }
}
