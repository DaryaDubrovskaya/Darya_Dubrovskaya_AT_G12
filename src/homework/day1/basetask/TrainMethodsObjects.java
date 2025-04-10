package homework.day1.basetask;

public class TrainMethodsObjects {

    public void processMouse() {
        Mouse mouse = new Mouse("Мышь Летучая", 25);
        mouse.printMouseDetails();

        System.out.println(mouse.getName());
        System.out.println(mouse.getAge());
    }

    public void processSouce() {
        Souce souce = new Souce("сырный", "сливочно-желтый");
        souce.printSouceDetails();

        System.out.println(souce.getName());
        System.out.println(souce.getColour());
    }

    public void processBee() {
        Bee bee = new Bee("муж", 56);
        bee.printBeeDetails();

        System.out.println(bee.getGender());
        System.out.println(bee.getWeight());
    }

    public void processObstacle() {
        Obstacle obstacle = new Obstacle("в виде лежачего бревна", "непреодолимое");
        obstacle.printObstacleDetails();

        System.out.println(obstacle.getDescription());
        System.out.println(obstacle.getSeverity());
    }

    public void processPineapple() {
        Pineapple pineapple = new Pineapple("сорт Белорус", 3200);
        pineapple.printPineappleDetails();

        System.out.println(pineapple.getGrade());
        System.out.println(pineapple.getHeatCapacity());
    }

}
