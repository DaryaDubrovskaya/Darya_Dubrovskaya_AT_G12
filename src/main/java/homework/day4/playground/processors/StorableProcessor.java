package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.hand.Storable;
import homework.day4.playground.essence.material.Pourable;
import homework.day4.playground.utils.VolumeGenerator;

import java.util.Random;

public class StorableProcessor {

    public void runStorable(Storable storable, Pourable pourable) {
        storable.store(pourable, VolumeGenerator.generateVolume(pourable));
    }

    public void runStorable(Storable storable, Pourable pourable, int volume) {
        storable.store(pourable, volume);
    }
}
