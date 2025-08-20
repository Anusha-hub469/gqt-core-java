package Encapsulation2;
class Book1 {
    private String title;
    private String author;
    private int price;
    void setData(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void getData() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
    }
}
public class Exple7 {
    public static void main(String[] args) {
        Book1 b = new Book1();
        b.setData("Wings of Fire", "A.P.J. Abdul Kalam", 350);
        b.getData();
    }
}
