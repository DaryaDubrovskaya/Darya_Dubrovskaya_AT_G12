package basetask;

public class Pineapple {

    private static String grade;
    private static double heatCapacity;

    public static void main(String[] args) {
        Pineapple pineapple = new Pineapple("сорт Белорус", 3200);
        pineapple.printPineappleDetails();
    }

    public static void printPineappleDetails() {
        if (heatCapacity >= 2140){
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше " + "\uD83D\uDE1E");
        }
    }

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public static String getGrade() {
        return grade;
    }

    public static void setGrade(String grade) {
        Pineapple.grade = grade;
    }

    public static double getHeatCapacity() {
        return heatCapacity;
    }

    public static void setHeatCapacity(double heatCapacity) {
        Pineapple.heatCapacity = heatCapacity;
    }
}
