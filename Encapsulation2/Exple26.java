package Encapsulation2;
class Teacher {
    private String name;
    private String subject;
    private int experience;
    void setData(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }
    void getData() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
    }
}
public class Exple26 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setData("Mr. Sharma", "Math", 10);
        t.getData();
    }
}
