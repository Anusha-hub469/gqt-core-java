package Encapsulation2;
class Movie1 {
    private String name;
    private String director;
    private int year;
    void setData(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }
    void getData() {
        System.out.println("Movie Name: " + name);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
    }
}
public class Exple24 {
    public static void main(String[] args) {
        Movie1 movie = new Movie1();
        movie.setData("Inception", "Christopher Nolan", 2010);
        movie.getData();
    }
}
