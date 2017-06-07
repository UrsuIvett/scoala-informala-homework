package ro.sci.carrental.service;

import ro.sci.carrental.domain.Car;

import java.util.List;

/**
 * Created by Ivett on 26-May-17.
 */
public interface CarService {

    List<Car> findCarsByMake (String make);

    List<Car> findCarsByMakeAndModel (String make, String model);

    List<Car> findCarsByMultipleCategories (String make,String model, String color);

}
