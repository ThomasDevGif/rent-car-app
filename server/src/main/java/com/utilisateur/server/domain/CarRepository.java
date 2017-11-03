package com.utilisateur.server.domain;

import java.util.HashMap;

public class CarRepository {

    private static HashMap<String, Car> listUnrentedCars;
    private static HashMap<String, Car> listRentedCars;

    public static void initLists() {
        listUnrentedCars = new HashMap<>();
        listRentedCars = new HashMap<>();
    }

    public static HashMap<String, Car> getListUnrentedCars() {
        return listUnrentedCars;
    }

    public static void setListUnrentedCars(HashMap<String, Car> unrentedCars) {
        listUnrentedCars = unrentedCars;
    }

    public static HashMap<String, Car> getListRentedCars() {
        return listRentedCars;
    }

    public static void setListRentedCars(HashMap<String, Car> rentedCars) {
        listRentedCars = rentedCars;
    }

    public static void addUnrentedCar(Car car) {
        listUnrentedCars.put(car.getPlateNumber(), car);
    }

    public static void addRentedCar(Car car) {
        listRentedCars.put(car.getPlateNumber(), car);
    }

    public static void removeUnrentedCar(String plateNumber) {
        listUnrentedCars.remove(plateNumber);
    }

    public static void removeRentedCar(String plateNumber) {
        listRentedCars.remove(plateNumber);
    }
}
