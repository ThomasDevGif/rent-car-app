import { Component, OnInit } from '@angular/core';
import { Car } from '../../models/car';
import { RestService } from '../../services/rest.service'

@Component({
  selector: 'my-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})

export class AdminComponent implements OnInit {

  public myCar: Car = {
    plateNumber: null,
    price: null,
    manufacturer: null,
    brand: null,
    year: null,
    km: null,
    image: null
  }

  constructor(
    private restService: RestService
  ){}

  ngOnInit(): void {

  }

  checkNotNull(): boolean {
    return (this.myCar.plateNumber != null && this.myCar.price &&
    this.myCar.manufacturer != null && this.myCar.brand != null &&
    this.myCar.year != null && this.myCar.km != null && this.myCar.image != null);
  }

  addCar(): void {
    if (this.checkNotNull()) {
      this.restService.addCar(this.myCar)
      .then(() => console.log('Car added.'));
    } else {
      // Error message
    }
  }

}
