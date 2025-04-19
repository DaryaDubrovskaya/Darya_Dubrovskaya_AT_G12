package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Matter;

public abstract class Plant extends Matter {

    protected String name;

    public Plant(int weight, int mass, String name) {
        super(weight, mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
