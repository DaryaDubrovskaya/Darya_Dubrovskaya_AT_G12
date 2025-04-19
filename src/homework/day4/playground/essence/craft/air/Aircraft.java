package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {

    protected String name;

    public Aircraft(int weight, int mass, String name) {
        super(weight, mass);
        this.name = name;
    }

    public Aircraft() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass(), this.name, direction); // тут что-то не то !? this.getClass().getSimpleName() ??
    }
}
