package homework.day1.basetask;

public class Souce {

    private String name;
    private String colour;

    public Souce(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + " " + colour + " цвета");
    }

}


