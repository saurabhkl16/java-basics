
abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car start");
    }
}

class Abstraction {

    public static void main(String[] args) {
        Car nano = new Car();
        nano.start();
    }
}
