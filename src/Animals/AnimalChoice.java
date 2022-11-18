package Animals;

import Beast.*;
import Bird.*;
import Fish.*;

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
            case 3:
                System.out.println("Carp");
                Carp carp = new Carp();
                carp.breathe();
                carp.move();
                carp.unique();
                break;
            case 4:
                System.out.println("Shark");
                Shark shark = new Shark();
                shark.breathe();
                shark.move();
                shark.unique();
                break;
            case 5:
                System.out.println("Eagle");
                Eagle eagle = new Eagle();
                eagle.breathe();
                eagle.move();
                eagle.unique();
                break;
            case 6:
                System.out.println("Chicken");
                Chicken chicken = new Chicken();
                chicken.breathe();
                chicken.move();
                chicken.unique();
                break;
            default:
                System.out.println("?");
        }
    }
}
