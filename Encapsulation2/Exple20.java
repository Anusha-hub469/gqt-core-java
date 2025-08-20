package Encapsulation2;
class Pen {
    private String brand;
    private String color;
    private double price;
    void setData(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    void getData() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
    }
}
public class Exple20 {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setData("Reynolds", "Blue", 10.0);
        p.getData();
    }
}
