package Encapsulation2;
class Item {
    private String title;
    private int code;
    private int value;
    void setData(String title, int code, int value) {
        this.title = title;
        this.code = code;
        this.value = value;
    }
    void getData() {
        System.out.println("Title: " + title);
        System.out.println("Code: " + code);
        System.out.println("Value: " + value);
    }
}
public class Exple12 {
    public static void main(String[] args) {
        Item i = new Item();
        i.setData("Book", 123, 50);
        i.getData();
    }
}
