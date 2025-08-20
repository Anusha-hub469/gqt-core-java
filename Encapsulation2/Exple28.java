package Encapsulation2;
class House {
    private String address;
    private int rooms;
    private double price;
    void setData(String address, int rooms, double price) {
        this.address = address;
        this.rooms = rooms;
        this.price = price;
    }
    void getData() {
        System.out.println("Address: " + address);
        System.out.println("Rooms: " + rooms);
        System.out.println("Price: ₹" + price);
    }
}
public class Exple28 {
    public static void main(String[] args) {
        House h = new House();
        h.setData("123 Maple Street", 4, 7500000);
        h.getData();
    }
}
