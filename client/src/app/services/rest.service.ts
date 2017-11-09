import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

import { Car } from '../models/car';

@Injectable()
export class RestService {

  private baseUrl = 'http://localhost:8080/';  // URL to web api
  private headers = new Headers();
  private headersJson = new Headers({ 'Content-Type': 'application/json' });

  constructor(private http: Http) { }

  getUnrentedCars(): Promise<Car[]> {
    return this.http
      .get(this.baseUrl + 'unrented-cars')
      .toPromise()
      .then(response => response.json() as Car[])
      .catch(this.handleError);
  }

  getRentedCars(): Promise<Car[]> {
    return this.http
      .get(this.baseUrl + 'rented-cars')
      .toPromise()
      .then(response => response.json() as Car[])
      .catch(this.handleError);
  }

  rentCar(plateNumber : string): Promise<any> {
     var url = this.baseUrl + 'car/' + plateNumber;
     return this.http.put(url, null, {headers: this.headers})
       .toPromise();
  }

  getBackCar(plateNumber : string): Promise<any> {
     var url = this.baseUrl + 'car/' + plateNumber;
     return this.http.delete(url)
       .toPromise();
  }

  addCar(car : Car): Promise<any> {
    var url = this.baseUrl + 'car';
    return this.http.post(url, car, {headers: this.headersJson})
      .toPromise();
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred: ', error);
    return Promise.reject(error.message || error);
  }

}
