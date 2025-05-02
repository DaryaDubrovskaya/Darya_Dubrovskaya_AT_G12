package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {

        int d = transportable.move(5, 8);
        System.out.printf("Transportable %s was moved to %d points", this.getClass().getSimpleName(), d);
    }

    public void runTransportable(Transportable transportable) {

        int g = transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
        System.out.printf("Transportable %s was moved to %d points", this.getClass().getSimpleName(), g);
    }

}
