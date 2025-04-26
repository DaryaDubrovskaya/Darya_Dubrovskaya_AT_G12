package homework.day4.playground.essence.craft.hand;

import homework.day4.playground.essence.material.Pourable;

public class Can extends Container implements Storable {
    public Can(int mass, String name) {
        super(mass, name);
    }

    public void store(Pourable pourable, int amount) {
        pourable.spread(this.name);
        System.out.printf("I am %s, my name is %s and I received %d of %s", this.getClass().getSimpleName(), this.name, amount, pourable.getClass().getSimpleName());

        if (amount > this.mass) {
            System.out.println("waah-waah-waah-hh..");
        }
    }
}
