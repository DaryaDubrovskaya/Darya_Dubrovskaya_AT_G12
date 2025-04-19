package homework.day4.playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int weight, int mass, String name) {
        super(weight, mass, name);
    }

    public void eat(Insect food) {

        System.out.printf("I am %s and I am eating %s", this.getName(), food.getName());
    }
}
