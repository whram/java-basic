package reacher.demo02;

public class main {

    public static void main(String[] args) {
        Phone p1 = getPhone("apple", "black", 8388);
        method(p1);
    }

    public static void method(Phone p){
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);

        p.call("Adam");
        p.game();
    }

    public static Phone getPhone(String brand, String color, double price){
        Phone p = new Phone();
        p.brand = brand;
        p.color = color;
        p.price = price;

        return p;
    }

}
