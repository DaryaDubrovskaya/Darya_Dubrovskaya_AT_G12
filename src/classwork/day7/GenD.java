package classwork.day7;

public class GenD<X> {

    X buga;

    public GenD(X buga) {
        this.buga = buga;
        System.out.println(this.buga);
    }

    @Override
    public String toString() {
        return "GenD{" +
                "buga=" + buga +
                '}';
    }
}
