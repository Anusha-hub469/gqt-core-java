package Encapsulation2;
class Person {
    private String name;
    private int age;
    private String city;
    void setData(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    void getData() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("City = " + city);
    }
}
public class Exple2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setData("Rahul", 25, "Mumbai");
        p.getData();
    }
}
