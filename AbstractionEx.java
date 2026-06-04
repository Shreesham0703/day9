abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }
}

public class AbstractionEx {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}