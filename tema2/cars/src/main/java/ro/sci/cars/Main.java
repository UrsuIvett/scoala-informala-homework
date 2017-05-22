package ro.sci.cars;

import ro.sci.cars.util.FuelType;

public class Main {

    public static void main(String[] args) {
        int numberOfGears = 5;
        if (numberOfGears >= 7) {
            System.out.println("Choose the gear number between 1-6");
        }
    else {
        Vehicle car = new Car(12, FuelType.DIESEL, 60, 5, 4.5);
        System.out.println("Simulating a car drive:");
        simulateDriving(car);


        Vehicle horse = new Horse();
        System.out.println("Simulating a horse ride:");
        simulateDriving(horse);
    }

    }

    private static void simulateDriving(Vehicle vehicle) {
        vehicle.start();
        vehicle.shiftGear(1);
        vehicle.drive(0.01);
        vehicle.shiftGear(2);
        vehicle.drive(0.1);
        vehicle.shiftGear(3);
        vehicle.drive(0.2);
        vehicle.shiftGear(4);
        vehicle.drive(0.5);
        vehicle.shiftGear(5);
        vehicle.drive(11.5);
        vehicle.shiftGear(1);
        vehicle.stop();

        double availableFuel = vehicle.getAvailableFuel();
        System.out.println("available fuel: " + availableFuel);

        double avgFuelPer100km = vehicle.getAvgFuelPer100km();
        System.out.println("avg fuel per 100 km: " + avgFuelPer100km);
    }
}
