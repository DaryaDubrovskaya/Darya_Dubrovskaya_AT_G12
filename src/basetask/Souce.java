package basetask;

public class Souce {

    private static String name;
    private static String colour;

    public static void main(String[] args) {
        Souce souce = new Souce("Сырный", "сливочно-желтого");
        souce.printSouceDetails ();
    }

    public static void printSouceDetails() {
        System.out.println("Это соус " + name + " " + colour + " цвета");
    }

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
}


