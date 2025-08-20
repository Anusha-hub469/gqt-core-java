package Encapsulation2;
class Phone {
    private String brand;
    private String model;
    private int price;
    void setData(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void getData() {
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
    }
}
public class Exple6 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setData("Samsung", "Galaxy S21", 70000);
        p.getData();
    }
}
