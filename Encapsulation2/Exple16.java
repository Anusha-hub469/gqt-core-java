package Encapsulation2;
class Entry {
    private String description;
    private int codeNumber;
    private int points;
    void setDetails(String description, int codeNumber, int points) {
        this.description = description;
        this.codeNumber = codeNumber;
        this.points = points;
    }
    void showDetails() {
        System.out.println("Description: " + description);
        System.out.println("Code Number: " + codeNumber);
        System.out.println("Points: " + points);
    }
}
public class Exple16 {
    public static void main(String[] args) {
        Entry entry = new Entry();
        entry.setDetails("Example", 789, 85);
        entry.showDetails();
    }
}
