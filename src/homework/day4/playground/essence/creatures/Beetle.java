package homework.day4.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {

        if (this.getMass() < home.getMass()) {

            System.out.printf("I am %s and I will nest there with %d my family members!", this.name, home.getMass() / this.getMass()); // - уточнить, переписать !!!
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
