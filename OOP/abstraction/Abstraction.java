
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
        // Vehicle vc = new Vehicle(); -> wrong & limited only one extend.
        Vehicle vc = new Car();
        Car nano = new Car();
        vc.start();
    }
}
