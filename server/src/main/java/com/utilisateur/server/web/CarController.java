package com.utilisateur.server.web;

import com.utilisateur.server.domain.Car;
import com.utilisateur.server.domain.CarRepository;
import com.utilisateur.server.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@Controller
public class CarController {

    @RequestMapping(value = "/unrented-cars", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfUnrentedCars(){
        return new ArrayList<>(CarRepository.getListUnrentedCars().values());
    }

    @RequestMapping(value = "/rented-cars", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfRentedCars(){
        return new ArrayList<>(CarRepository.getListRentedCars().values());
    }

    @RequestMapping(value = "/car/{plateNumber}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void getBack(@PathVariable("plateNumber") String plateNumber) throws Exception{
        CarService carService = new CarService();
        carService.getBackCar(plateNumber);
    }

    @RequestMapping(value = "/car/{plateNumber}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception{
        CarService carService = new CarService();
        carService.rentCar(plateNumber);
    }
}
