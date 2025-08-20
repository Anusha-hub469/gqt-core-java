package Encapsulation2;
class City {
    private String name;
    private String state;
    private int population;
    void setData(String name, String state, int population) {
        this.name = name;
        this.state = state;
        this.population = population;
    }
    void getData() {
        System.out.println("City Name: " + name);
        System.out.println("State: " + state);
        System.out.println("Population: " + population);
    }
}
public class Exple22 {
    public static void main(String[] args) {
        City c = new City();
        c.setData("Pune", "Maharashtra", 6500000);
        c.getData();
    }
}
