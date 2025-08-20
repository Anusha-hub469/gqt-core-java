package Encapsulation2;
class Student4 {
    private String name;
    private int rollNumber;
    private int marks;

    void setData(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void getData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Exple9 {
    public static void main(String[] args) {
        Student4 s = new Student4();
        s.setData("John Doe", 101, 95);
        s.getData();
    }
}
