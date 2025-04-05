package basetask;

public class Bee {

    private static String gender;
    private static long weight;

    public static void main(String[] args) {
        Bee bee = new Bee("муж", 56);
        bee.printBeeDetails();
    }

    public static void printBeeDetails() {
        System.out.println("Я легче лося в " + (500 / (1.00 * weight)) + " раз");
    }

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Bee.gender = gender;
    }

    public static long getWeight() {
        return weight;
    }

    public static void setWeight(long weight) {
        Bee.weight = weight;
    }
}
