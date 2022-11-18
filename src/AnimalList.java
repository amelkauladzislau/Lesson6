
public class AnimalList {

    public void AnimalsNumber() {
        Animals dog = Animals.Dog;
        Animals cat = Animals.Cat;

        System.out.println("List of Animals:\n" + dog.getCount() + ". " + dog.getAnimal() + "\n" +
                cat.getCount() + ". " + cat.getAnimal() + "\n");
    }

}

