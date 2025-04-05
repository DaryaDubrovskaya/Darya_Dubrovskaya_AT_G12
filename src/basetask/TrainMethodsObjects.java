package basetask;

public class TrainMethodsObjects {

    public static void main(String[] args) {
    //TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
//    trainMethodsObjects.processMouse();
//    trainMethodsObjects.processSouce();
//    trainMethodsObjects.processBee();
//    trainMethodsObjects.processObstacle();
//    trainMethodsObjects.processPineapple();
        processMouse();
        processSouce();
        processBee();
        processObstacle();
        processPineapple();
    }

    public static void processMouse () {
        Mouse mouse = new Mouse("Мышь Летучая", 25);
        mouse.printMouseDetails();

        System.out.println(mouse.getName());
        System.out.println(mouse.getAge());
    }

    public static void processSouce () {
        Souce souce = new Souce("Сырный", "сливочно-желтого");
        souce.printSouceDetails();

        System.out.println(souce.getName());
        System.out.println(souce.getColour());
    }

    public static void processBee () {
        Bee bee = new Bee("муж", 56);
        bee.printBeeDetails();

        System.out.println(bee.getGender());
        System.out.println(bee.getWeight());
    }

    public static void processObstacle () {
        Obstacle obstacle = new Obstacle("<описание препятствия>", "<важность>");
        obstacle.printObstacleDetails();

        System.out.println(obstacle.getDescription());
        System.out.println(obstacle.getSeverity());
    }

    public static void processPineapple () {
        Pineapple pineapple = new Pineapple("сорт Белорус", 3200);
        pineapple.printPineappleDetails();

        System.out.println(pineapple.getGrade());
        System.out.println(pineapple.getHeatCapacity());
    }
}
