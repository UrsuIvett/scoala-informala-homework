package ro.sci.cars;

import ro.sci.cars.util.CalculateRuleOfThree;
import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Car implements Vehicle {

    private int fuelTankSize;
    private int gears;
    private double availableFuel;
    private FuelType fuelType;
    private double factoryAvgConsumptionPer100km;
    private double driveAvgConsumptionPer100km;
    private int currentGear;
    private double consumptionPerGear;
    private double sumFuel = 0;
    private double avgSum = 0;
    private int usedGear = 0;


    public Car(double fuel, FuelType fuelType, int fuelTankSize, int gears, double avgConsumption) {
        this.availableFuel = fuel;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.factoryAvgConsumptionPer100km = avgConsumption;
    }

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void drive(double km) {
        System.out.println("drive " + km);
        switch (currentGear) {
            case 1:
                consumptionPerGear = 12;
                break;
            case 2:
                consumptionPerGear = 10;
                break;
            case 3:
                consumptionPerGear = 8;
                break;
            case 4:
                consumptionPerGear = 7;
                break;
            case 5:
                consumptionPerGear = 5;
                break;
            case 6:
                consumptionPerGear = 4;
                break;
            default:
                consumptionPerGear = 0;
        }
        /*
        we creat a new object to use CalculateRuleOfThree}
         */
        CalculateRuleOfThree currentConsumptionPerGear = new CalculateRuleOfThree();
        /*
        this is how we calculate the available fuel for the car, the consumptionPerGear represents the
        consumption for the current gear
         */
       this.availableFuel = this.availableFuel - currentConsumptionPerGear.calculate(consumptionPerGear, km,100);
       /*
       the calcul of avarage fuel per 100 km
        */
        avgSum = avgSum + consumptionPerGear;
        usedGear = usedGear + 1;
        this.driveAvgConsumptionPer100km = avgSum/usedGear;

    }

        public void shiftGear ( int gear){
        System.out.println("shiftGear " + gear);
        this.currentGear = gear;
    }

    public double getAvailableFuel() {
        return this.availableFuel;
    }

    public double getAvgFuelPer100km() {
        return this.driveAvgConsumptionPer100km;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }


}
