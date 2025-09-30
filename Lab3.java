class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void start() {
        super.start(); 
        System.out.println("Car engine is starting.");
    }
}
class ElectricCar extends Car {
    void start() {
        super.start(); 
        System.out.println("ElectricCar is starting silently.");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        ElectricCar e = new ElectricCar();

        v.start();
        c.start();
        e.start();
    }
}
