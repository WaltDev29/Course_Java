package chapter07.car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        
        car1.setName("아이오닉9");
        car1.setPrice(70000000);
        car1.setProduct("현대자동차");
        car1.setYear(2025);
        car1.setCc(3000);

        car2.setName("X7");
        car2.setPrice(150000000);
        car2.setProduct("BMW");
        car2.setYear(2024);
        car2.setCc(3500);

        car3.setName("EV6");
        car3.setPrice(60000000);
        car3.setProduct("기아자동차");
        car3.setYear(2023);
        car3.setCc(2000);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        System.out.println("==================================");
        System.out.print(car1.getName() + " 자동차가 ");
        car1.start();
        car1.drive(60);
        car1.mvF();
        car1.stop();

        System.out.println("==================================");
        System.out.print(car3.getName() + " 자동차가 ");
        car3.start();
        car3.drive(30);
        car3.mvF();
        car3.stop();
        car3.mvB();
        car3.stop();
    }
}
