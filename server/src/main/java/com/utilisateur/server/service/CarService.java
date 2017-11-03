package com.utilisateur.server.service;

import com.utilisateur.server.domain.Car;
import com.utilisateur.server.domain.CarRepository;

import java.util.HashMap;

public class CarService {

    public CarService() {

    }

    public void getBackCar(String plateNumber) {
        // Get rented car
        HashMap<String, Car> cars = CarRepository.getListRentedCars();
        Car car = cars.get(plateNumber);
        // Get back car
        CarRepository.addUnrentedCar(car);
        CarRepository.removeRentedCar(plateNumber);
    }

    public void rentCar(String plateNumber) {
        // Get car to rent
        HashMap<String, Car> cars = CarRepository.getListUnrentedCars();
        Car rentedCar = cars.get(plateNumber);
        // Rent car
        CarRepository.addRentedCar(rentedCar);
        CarRepository.removeUnrentedCar(plateNumber);
    }

    public static void initCars() {
        Car car = new Car();
        car.setPlateNumber("OP159GG");
        car.setPrice("250");
        car.setManufacturer("Ford");
        car.setBrand("Mustang");
        car.setYear("2017");
        car.setKm("10000");
        car.setImage("https://www.cstatic-images.com/stock/900x600/1475697570035.jpg");

        Car car2 = new Car();
        car2.setPlateNumber("AB123AB");
        car2.setPrice("35");
        car2.setManufacturer("Renault");
        car2.setBrand("Clio");
        car2.setYear("2009");
        car2.setKm("40000");
        car2.setImage("https://images.honestjohn.co.uk/imagecache/file/fit/730x700/media/3502345/Renault~Clio~(3).jpg");

        Car car3 = new Car();
        car3.setPlateNumber("RG789LK");
        car3.setPrice("70");
        car3.setManufacturer("Mitsubishi");
        car3.setBrand("Lancer XVIII");
        car3.setYear("2002");
        car3.setKm("150000");
        car3.setImage("http://www.larevueautomobile.com/fiche-technique/photos/2005/Mitsubishi/Lancer/Mitsubishi_Lancer_001.jpg");

        Car car4 = new Car();
        car4.setPlateNumber("GL456HF");
        car4.setPrice("60");
        car4.setManufacturer("Peugeot");
        car4.setBrand("208");
        car4.setYear("2014");
        car4.setKm("20000");
        car4.setImage("http://img.turbo.fr/07457905-photo-peugeot-208-gti-30th.jpg");

        Car car5 = new Car();
        car5.setPlateNumber("TT482QD");
        car5.setPrice("55");
        car5.setManufacturer("Fiat");
        car5.setBrand("500");
        car5.setYear("2016");
        car5.setKm("12000");
        car5.setImage("http://images.car.bauercdn.com/pagefiles/15086/1752x1168/2016fiat5005.jpg?mode=max&quality=90&scale=down");

        Car car6 = new Car();
        car6.setPlateNumber("FV154BV");
        car6.setPrice("70");
        car6.setManufacturer("Renault");
        car6.setBrand("Twingo RS");
        car6.setYear("2012");
        car6.setKm("600");
        car6.setImage("https://www.carpixel.net/w/4690d9f404f3ab207af366efc4a08718/renault-twingo-r-s-133-wallpaper-hd-8857.jpg");

        CarRepository.addUnrentedCar(car);
        CarRepository.addUnrentedCar(car2);
        CarRepository.addUnrentedCar(car3);
        CarRepository.addUnrentedCar(car4);
        CarRepository.addUnrentedCar(car5);

        System.out.println("Initialization done.");
    }
}
