import Beast.*;
//import Bird.*;
//import Fish.*;

import java.util.Scanner;

public class AnimalChoice {

    public void AnimalChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Dog");
                Dog dog = new Dog();
                dog.breathe();
                dog.move();
                dog.unique();
                break;
            case 2:
                System.out.println("Cat");
                Cat cat = new Cat();
                cat.breathe();
                cat.move();
                cat.unique();
                break;
        }
    }
}
