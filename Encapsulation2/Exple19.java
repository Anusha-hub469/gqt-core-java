package Encapsulation2;
class Computer {
    private String brand;
    private String model;
    private double price;
    void setData(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void getData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}
public class Exple19 {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setData("Dell", "Inspiron", 75000);
        c.getData();
    }
}
