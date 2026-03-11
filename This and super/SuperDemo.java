
class SuperDemo {

    static class Animal {

        String name;
        String type = "Animal";

        // Super can access only parent , not grand parent.
        // If remove default constructor child get error / need super because Animal need name to call;
        public Animal() {
        }

        Animal(String name) {
            this.name = name;
        }

        void makeSound() {
            System.out.println("Make sound");
        }

    }

    static class Dog extends Animal {

        String bread;
        String type = "Dog";

        Dog(String name, String bread) {
            super(name);
            super.type = this.type;
            this.bread = bread;
        }

        void printData() {
            System.out.println("name:" + name);
            System.out.println("type:" + type);
            System.out.println("bread:" + bread);
        }

    }

    public static void main(String[] args) {
        Dog tommy = new Dog("Tommy", "indian");
        tommy.printData();

    }
}
