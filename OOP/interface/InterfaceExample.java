
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog Barg");
    }
}

class InterfaceExample {

    static void run() {
        System.out.println(".()");
    }

    public static void main(String[] args) {
        Dog moti = new Dog();
        run();
        moti.sound();
    }
}
