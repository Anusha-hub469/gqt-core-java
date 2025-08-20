package Encapsulation2;
class Employee {
    private String name;
    private int id;
    private double salary;
    void setData(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void getData() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class Exple13 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setData("John Doe", 101, 50000);
        emp.getData();
    }
}
