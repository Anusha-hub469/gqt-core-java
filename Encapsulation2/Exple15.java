package Encapsulation2;
class MobilePhone {
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
        System.out.println("Price: " + price);
    }
}
public class Exple15 {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.setData("Samsung", "Galaxy S21", 799.99);
        phone.getData();
    }
}
