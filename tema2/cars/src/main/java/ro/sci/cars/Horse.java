package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Horse implements Vehicle {

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void drive(double km) {
        System.out.println("drive");
    }

    public void shiftGear(int gear) {
        System.out.println("shiftGear");
    }

    public double getAvailableFuel() {
        System.out.println("Your horse is hungry! Give it some food man!");
        return 0;
    }

    public double getAvgFuelPer100km() {
        System.out.println("Your horse is really fast! But you can't measure its avarage fuel!");
        return 0;
    }

    public FuelType getFuelType() {
        return FuelType.OVAZ;
    }
}
