// 1️⃣ Compile Time Polymorphism
//    -> (Method Overloading) # imp #

class MathOp {

    int add(int a, int b) {
        System.out.print("int:");
        return a + b;
    }

    double add(double a, double b) {
        System.out.print("double:");
        return a + b;
    }
}

// 2️⃣ Runtime Polymorphism
//    -> (Method Overriding) # imp #
class Animal {

    String type;

    void sound() {
        System.out.println("Animmal sound");
    }
}

class Dog extends Animal {

    String name;

    void sound() {
        System.out.println("Dog barks");
    }
}

class Polymorphism {

    public static void main(String[] args) {
        MathOp a = new MathOp();
        System.out.println(a.add(122.45, 32.23));
        System.out.println(a.add(2, 3));

        // Give compaile time error 
        // Animal moti = new Dog();
        // moti.name = "Sdsd";
        Dog moti = new Dog();
        moti.sound();
        moti.type = "sdsd";
        moti.name = "Sdsd";
    }
}
