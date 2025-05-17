package homework.day4.playground.runners;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.hand.Bottle;
import homework.day4.playground.essence.craft.hand.Can;
import homework.day4.playground.essence.craft.hand.Container;
import homework.day4.playground.essence.craft.hand.Storable;
import homework.day4.playground.essence.material.*;
import homework.day4.playground.processors.StorableProcessor;

public class StorableProcessorRunner {

    public static void main(String[] args) {

        StorableProcessor storableProcessor = new StorableProcessor();

        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");

        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
        //Matter matterPetrol = new Petrol(2);
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);

        storableProcessor.runStorable(bottle, petrol);
        storableProcessor.runStorable(bottle, pourablePetrol);
        storableProcessor.runStorable(bottle, pourableDiesel);
        //storableProcessor.runStorable(bottle, powerableDiesel);
        //storableProcessor.runStorable(bottle, matterPetrol);
        storableProcessor.runStorable(bottle, water);
        storableProcessor.runStorable(bottle, pourableWater);

        storableProcessor.runStorable(storableBottle, petrol);
        storableProcessor.runStorable(storableBottle, pourablePetrol);
        storableProcessor.runStorable(storableBottle, pourableDiesel);
        //storableProcessor.runStorable(storableBottle, powerableDiesel);
        //storableProcessor.runStorable(storableBottle, matterPetrol);
        storableProcessor.runStorable(storableBottle, water);
        storableProcessor.runStorable(storableBottle, pourableWater);

        //storableProcessor.runStorable(containerBottle, petrol);
        //storableProcessor.runStorable(containerBottle, pourablePetrol);
        //storableProcessor.runStorable(containerBottle, pourableDiesel);
        //storableProcessor.runStorable(containerBottle, powerableDiesel);
        //storableProcessor.runStorable(containerBottle, matterPetrol);
        //storableProcessor.runStorable(containerBottle, water);
        //storableProcessor.runStorable(containerBottle, pourableWater);

        //storableProcessor.runStorable(matterBottle, petrol);
        //storableProcessor.runStorable(matterBottle, pourablePetrol);
        //storableProcessor.runStorable(matterBottle, pourableDiesel);
        //storableProcessor.runStorable(matterBottle, powerableDiesel);
        //storableProcessor.runStorable(matterBottle, matterPetrol);
        //storableProcessor.runStorable(matterBottle, water);
        //storableProcessor.runStorable(matterBottle, pourableWater);

        storableProcessor.runStorable(can, petrol);
        storableProcessor.runStorable(can, pourablePetrol);
        storableProcessor.runStorable(can, pourableDiesel);
        //storableProcessor.runStorable(can, powerableDiesel);
        //storableProcessor.runStorable(can, matterPetrol);
        storableProcessor.runStorable(can, water);
        storableProcessor.runStorable(can, pourableWater);

        storableProcessor.runStorable(storableCan, petrol);
        storableProcessor.runStorable(storableCan, pourablePetrol);
        storableProcessor.runStorable(storableCan, pourableDiesel);
        //storableProcessor.runStorable(storableCan, powerableDiesel);
        //storableProcessor.runStorable(storableCan, matterPetrol);
        storableProcessor.runStorable(storableCan, water);
        storableProcessor.runStorable(storableCan, pourableWater);

        //storableProcessor.runStorable(containerCan, petrol);
        //storableProcessor.runStorable(containerCan, pourablePetrol);
        //storableProcessor.runStorable(containerCan, pourableDiesel);
        //storableProcessor.runStorable(containerCan, powerableDiesel);
        //storableProcessor.runStorable(containerCan, matterPetrol);
        //storableProcessor.runStorable(containerCan, water);
        //storableProcessor.runStorable(containerCan, pourableWater);

        //storableProcessor.runStorable(matterCan, petrol);
        //storableProcessor.runStorable(matterCan, pourablePetrol);
        //storableProcessor.runStorable(matterCan, pourableDiesel);
        //storableProcessor.runStorable(matterCan, powerableDiesel);
        //storableProcessor.runStorable(matterCan, matterPetrol);
        //storableProcessor.runStorable(matterCan, water);
        //storableProcessor.runStorable(matterCan, pourableWater);

    }
}
