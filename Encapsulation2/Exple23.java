package Encapsulation2;
class Rectangle {
    private double length;
    private double width;
    private double area;
    void setData(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }
    void getData() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}
public class Exple23 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setData(5.5, 3.0);
        rect.getData();
    }
}
