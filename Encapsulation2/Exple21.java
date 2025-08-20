package Encapsulation2;
class LibraryBook {
    private String title;
    private String author;
    private double price;
    void setData(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void getData() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
public class Exple21 {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.setData("The Alchemist", "Paulo Coelho", 300);
        book.getData();
    }
}
