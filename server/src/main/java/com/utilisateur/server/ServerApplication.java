package com.utilisateur.server;

import com.utilisateur.server.domain.CarRepository;
import com.utilisateur.server.service.CarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        // Init
        CarRepository.initLists();
        CarService.initCars();
        // Start server
        SpringApplication.run(ServerApplication.class, args);
    }
}
