package Fish;

import Interface.ActionsInterface;

public class Fish implements ActionsInterface {

    @Override
    public void breathe() {
        System.out.println("Breathe via gills");
    }

    @Override
    public void move() {
        System.out.println("Move via fins");
    }

}