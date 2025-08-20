package Encapsulation2;
class Movie {
    private String name;
    private String director;
    private int duration;  
    void setData(String name, String director, int duration) {
        this.name = name;
        this.director = director;
        this.duration = duration;
    }
    void getData() {
        System.out.println("Name = " + name);
        System.out.println("Director = " + director);
        System.out.println("Duration = " + duration + " minutes");
    }
}
public class Exple8 {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.setData("Inception", "Christopher Nolan", 148);
        m.getData();
    }
}
