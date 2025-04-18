package homework.day4.playground.essence.craft.hand;

import homework.day4.playground.essence.Matter;

public abstract class Container extends Matter {

    protected String name;

    public Container(int weight, int mass, String name) {
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
