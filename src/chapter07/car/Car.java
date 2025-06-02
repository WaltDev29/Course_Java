package chapter07.car;

// Alt + Insert (생성자, getter, setter 자동생성)
public class Car {
    private String name;
    private String product;
    private int price;
    private int year;
    private int cc;

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("시동을 겁니다.");
    }
    public void drive(int speed) {
        System.out.println("시속"+ speed +"km로 달린다.");
    }
    public void mvF() {
        System.out.println("전진합니다.");
    }
    public void mvB() {
        System.out.println("후진합니다.");
    }
    public void stop() {
        System.out.println("정지합니다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", cc=" + cc +
                '}';
    }
}
