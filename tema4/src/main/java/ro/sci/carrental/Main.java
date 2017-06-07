package ro.sci.carrental;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.domain.FuelType;
import ro.sci.carrental.domain.GearBoxType;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

    /**
 * Created by Ivett on 24-May-17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("this looks like a message!");

        CarRepository carRepository = new CarRepositoryImpl();

        Car Ford = new Car("Ford", "Focus", FuelType.DIESEL, 1600, "Black", "Break", 5, 5, GearBoxType.MANUAL, true, true, true, true, 20);
        Car VW = new Car("Volkswagen", "Golf", FuelType.PETROL, 1400, "Silver", "Hatchback", 4, 5, GearBoxType.MANUAL, false, false, true, true, 10);
        Car Skoda = new Car("Skoda", "Octavia", FuelType.DIESEL, 1900, "Green", "Sedan", 5, 4, GearBoxType.AUTO, true, false, true, true, 15);
        Car Opel = new Car("Opel", "Zafira", FuelType.DIESEL, 1700, "Green", "Monovolum", 7, 5, GearBoxType.MANUAL, true, true, true, true, 30);

        carRepository.add(Ford);
        carRepository.add(VW);
        carRepository.add(Skoda);
        carRepository.add(Opel);

        searching(carRepository);
    }

    private static void searching(CarRepositoryImpl carRepositoryImpl) {

        System.out.println("Cars from the GARAGE");

        for (Car car : carRepositoryImpl.getAll()) {
            System.out.println(car.getMake());
        }
        System.out.println("These were our cars!");

        CarServiceImpl searchByMake = new CarServiceImpl(carRepositoryImpl);
        List<Car> foundCarsByMake = searchByMake.findCarsByMake("Opel");

        System.out.println("Cars after the search by make");
        for (Car car : foundCarsByMake) {
            System.out.println(car.getMake());
        }
        System.out.println("This was the search by make");

        CarServiceImpl searchByMakeAndModel = new CarServiceImpl(carRepositoryImpl);
        List<Car> foundCarsByMakeAndModel = searchByMakeAndModel.findCarsByMakeAndModel("Skoda", "Octavia");

        System.out.println("Cars after the search by make & model");
        for (Car car : foundCarsByMakeAndModel) {
            System.out.println(car.getMake() + " " + car.getModel());
        }
        System.out.println("This was the search by make & model");

        CarServiceImpl searchMultiple = new CarServiceImpl(carRepositoryImpl);
        List<Car> foundCarsByMultipleCategories = searchMultiple.findCarsByMultipleCategories("Skoda", "Octavia", "Green");

        System.out.println("Cars after the search by make & model & color");
        for (Car car : foundCarsByMultipleCategories) {
            System.out.println(car.getMake() + " " + car.getModel() + "" + car.getColor());
        }
        System.out.println("This was the search by make & model & color");


    }

}
