package Bird;

import Interface.ActionsInterface;

    public class Bird implements ActionsInterface {

        @Override
        public void breathe() {
            System.out.println("Breathe via lungs");
        }

        @Override
        public void move() {
            System.out.println("Move via wings");
        }

    }

