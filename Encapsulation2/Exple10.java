package Encapsulation2;
class Data {
    private String name;
    private int id;
    private int marks;
    void setData(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    void getData() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }
}
public class Exple10 {
    public static void main(String[] args) {
        Data d = new Data();
        d.setData("Alex", 101, 90);
        d.getData();
    }
}
