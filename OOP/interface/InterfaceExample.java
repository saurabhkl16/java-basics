
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog Barg");
    }
}

class InterfaceExample {

    public static void main(String[] args) {
        Dog moti = new Dog();
        moti.sound();
    }
}
