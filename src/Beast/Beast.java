package Beast;

import Interface.ActionsInterface;

public class Beast implements ActionsInterface {

    @Override
    public void breathe() {
        System.out.println("Breathe via lungs");
    }

    @Override
    public void move() {
        System.out.println("Move via legs");
    }

}
