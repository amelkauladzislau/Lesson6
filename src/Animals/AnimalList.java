package Animals;

public class AnimalList {

    public void AnimalsNumber() {
        Animals dog = Animals.Dog;
        Animals cat = Animals.Cat;
        Animals carp = Animals.Carp;
        Animals shark = Animals.Shark;
        Animals eagle = Animals.Eagle;
        Animals chicken = Animals.Chicken;

        System.out.println("List of Animals.Animals:\n" +
                dog.getCount() + ". " + dog.getAnimal() + "\n" +
                cat.getCount() + ". " + cat.getAnimal() + "\n" +
                carp.getCount() + ". " + cat.getAnimal() + "\n" +
                shark.getCount() + ". " + shark.getAnimal() + "\n" +
                eagle.getCount() + ". " + eagle.getAnimal() + "\n" +
                chicken.getCount() + ". " + chicken.getAnimal() + "\n");
    }

}

