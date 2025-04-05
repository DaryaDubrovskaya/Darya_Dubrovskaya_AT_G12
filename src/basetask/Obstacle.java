package basetask;

public class Obstacle {

    private static String description;
    private static String severity;

    public static void main(String[] args) {
        Obstacle obstacle = new Obstacle("<описание препятствия>", "<важность>");
        obstacle.printObstacleDetails();
    }

    public static void printObstacleDetails() {
        System.out.println("Возникло " + severity + " препятствие " + description);
    }

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Obstacle.description = description;
    }

    public static String getSeverity() {
        return severity;
    }

    public static void setSeverity(String severity) {
        Obstacle.severity = severity;
    }
}
