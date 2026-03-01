
class Animal {

    void eat() {
        System.out.println("Animal have for leg");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Inheritance {

    public static void main(String[] args) {
        Dog moti = new Dog();
        moti.bark();
        moti.eat();
    }
}
