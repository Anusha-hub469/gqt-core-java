package Encapsulation2;
class Laptop {
    private String brand;
    private int price;
    void setBrand(String brand) {
        this.brand = brand;
    }
    void setPrice(int price) {
        this.price = price;
    }
    String getBrand() {
        return brand;
    }
    int getPrice() {
        return price;
    }
}
public class Exple4 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setBrand("Dell");
        l.setPrice(60000);
        System.out.println("Brand = " + l.getBrand());
        System.out.println("Price = " + l.getPrice());
    }
}
