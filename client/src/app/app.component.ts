import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'RestClient';
  items = [
    { name: 'Home', link: '/' },
    { name: 'Cars', link: '/cars' }
  ]

  constructor (
    private router: Router
  ) {}

  goTo(item: any): void {
    this.router.navigate([item.link]);
  }
}
