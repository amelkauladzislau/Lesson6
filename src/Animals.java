

    public enum Animals {
        Dog(1, "Dog"),
        Cat(2, "Cat");

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

