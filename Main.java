 class MethodOverridingExample {

    // Base class
    static class Vehicle {
        void startEngine() {
            System.out.println("Vehicle engine starting...");
        }
    }

    // Derived class for Car
    static class Car extends Vehicle {
        @Override
        void startEngine() {
            System.out.println("Car engine starting with a roar!");
        }
    }

    // Derived class for Bike
    static class Bike extends Vehicle {
        @Override
        void startEngine() {
            System.out.println("Bike engine starting with a vroom!");
        }
    }
}

// Define the Main class with the main method
public class Main {
    public static void main(String[] args) {
        MethodOverridingExample.Vehicle myVehicle = new MethodOverridingExample.Vehicle();
        MethodOverridingExample.Vehicle myCar = new MethodOverridingExample.Car();
        MethodOverridingExample.Vehicle myBike = new MethodOverridingExample.Bike();
        
        myVehicle.startEngine();  // Output: Vehicle engine starting...
        myCar.startEngine();     // Output: Car engine starting with a roar!
        myBike.startEngine();    // Output: Bike engine starting with a vroom!
    }
}
