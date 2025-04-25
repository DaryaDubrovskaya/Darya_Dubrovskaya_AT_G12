package homework.day4.playground.processors;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        //DirectionGenerator directionGenerator = new DirectionGenerator(); //тут надо переписывать

        flyable.fly(DirectionGenerator.generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly("NORTH"); //тут надо переписывать?
    }
}
