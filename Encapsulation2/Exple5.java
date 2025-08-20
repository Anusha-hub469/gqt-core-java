package Encapsulation2;
class Car {
    private String model;
    private String color;
    private double price;
    void setData(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    void getData() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}
public class Exple5{
    public static void main(String[] args) {
        Car c = new Car();
        c.setData("Toyota", "Red", 25000.00);
        c.getData();
    }
}

