package Animals;

public enum Animals {
        Dog(1, "Dog"),
        Cat(2, "Cat"),
        Carp(3,"Carp"),
        Shark(4,"Shark"),
        Eagle(5,"Eagle"),
        Chicken(6,"Chicken");
        private int count;
        private String animal;

        Animals(int count, String animal) {
           this.animal = animal;
           this.count = count;
        }

        public int getCount() {
            return count;
        }

        public String getAnimal() {
            return animal;
        }
    }

