package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {

    public Mosquito(int weight, int mass, String name) {
        super(weight, mass, name);
    }

    public Mosquito(int weight, String vulgarisMosquito) {
    }

    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass(), this.name, direction); // тут что-то не то !? this.getClass().getSimpleName() ??
    }
}
