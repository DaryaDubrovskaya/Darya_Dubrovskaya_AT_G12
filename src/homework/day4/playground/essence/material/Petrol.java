package homework.day4.playground.essence.material;

public class Petrol implements Pourable, Powerable {

    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s", this.getClass().getSimpleName(), storeName);
        System.out.println("wheeh..");
    }
}
