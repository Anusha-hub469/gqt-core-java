package Encapsulation2;
class Student1 {
    private String name;
    private int rollNumber;
    private int age;
    void setData(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }
    void getData() {
        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNumber);
        System.out.println("Age = " + age);
    }
}
public class Student{
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setData("Alice", 101, 20);
        s.getData();
    }
}
