package homework.day4.playground.essence;

public abstract class Matter {

    protected int weight;

    int mass;

    public Matter(int weight, int mass) {
        this.weight = weight;
        this.mass = mass;
    }

    public Matter() {

    }

    public int getWeight() {
        return weight;
    }

    public int getMass() {
        return mass;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
