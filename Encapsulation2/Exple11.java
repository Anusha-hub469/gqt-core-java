package Encapsulation2;
class Circle {
    private double radius;
    private double area;
    private double circumference;
    void setData(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.circumference = 2 * Math.PI * radius;
    }
    void getData() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
public class Exple11{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setData(5.0);
        c.getData();
    }
}
