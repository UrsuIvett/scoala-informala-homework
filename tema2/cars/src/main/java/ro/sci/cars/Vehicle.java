package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public interface Vehicle {

    /**
     * Starts a vehicle.
     */
    void start();

    /**
     * Stops a vehicle.
     */
    void stop();

    /**
     * Drive a vehicle for a specified number of km.
     * @param km the number of km to drive.
     */
    void drive(double km);

    /**
     * Shift the car gear with the specified number.
     * @param gear the gear to shift in.
     */
    void shiftGear(int gear);

    /**
     * Finds the available fuel level in the car tank.
     * @return double value representing the remaining fuel in the car tank.
     */
    double getAvailableFuel();

    /**
     * Get the avg consumption per 100 km.
     * @return double value representing the avg consumption per 100 km.
     */
    double getAvgFuelPer100km();

    /**
     * Gets the fuel type of the current vehicle.
     * @return FuelType of the current vehicle.
     */
    FuelType getFuelType();
}
