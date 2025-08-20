package Encapsulation2;
class Record {
    private String label;
    private int number;
    private int score;
    void setData(String label, int number, int score) {
        this.label = label;
        this.number = number;
        this.score = score;
    }
    void getData() {
        System.out.println("Label: " + label);
        System.out.println("Number: " + number);
        System.out.println("Score: " + score);
    }
}
public class Exple14 {
    public static void main(String[] args) {
        Record r = new Record();
        r.setData("Sample", 456, 75);
        r.getData();
    }
}
