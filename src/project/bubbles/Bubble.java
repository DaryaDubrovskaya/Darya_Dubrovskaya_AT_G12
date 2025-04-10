package project.bubbles;

public class Bubble {

    double volume = 0.3;

    String gasСomposition;

    public Bubble(String gasСomposition) {
        this.gasСomposition = gasСomposition;
    }

    public void burstBubble() {

        System.out.println("Cramp!");
    }

}
