package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        //System.out.println(String.format("I am %s and I am eating %s%n", this.name, food.getName()));
        System.out.printf("I am %s and I am eating %s", this.getName(), food.getName());
    }
}
