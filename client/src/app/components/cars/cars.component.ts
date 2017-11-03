import { Component } from '@angular/core';
import { OnInit } from '@angular/core';

import { Car } from '../../models/car';

// Services
import { RestService } from '../../services/rest.service'

@Component({
  selector: 'my-car',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})

export class CarsComponent implements OnInit {
  title = "title";
  unrentedCars:Array<Car>=[];
  rentedCars:Array<Car>=[];

  constructor(
    private restService: RestService
  ){}

  ngOnInit(): void {
    this.getUnrentedCars();
    this.getRentedCars();
  }

  getUnrentedCars() {
    this.restService.getUnrentedCars()
    .then(res => {
      this.unrentedCars = res;
    });
  }

  getRentedCars() {
    this.restService.getRentedCars()
    .then(res => {
      this.rentedCars = res;
    });
  }

  rentCar(plateNumber: string) {
    this.restService.rentCar(plateNumber)
    .then(res => {
      this.getUnrentedCars();
    })
    .then(res => {
      this.getRentedCars();
    });
  }

  getBackCar(plateNumber: string) {
    this.restService.getBackCar(plateNumber)
    .then(res => {
      this.getUnrentedCars();
    })
    .then(res => {
      this.getRentedCars();
    });
  }

}
