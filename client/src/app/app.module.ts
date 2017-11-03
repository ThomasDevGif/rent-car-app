import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpModule }    from '@angular/http';
import { AppRoutingModule, RoutedComponents }   from './app-routing.module';

// Components
import { AppComponent } from './app.component';

// Services
import { RestService } from './services/rest.service';

@NgModule({
  declarations: [
    AppComponent,
    RoutedComponents
  ],
  imports: [
    NgbModule.forRoot(),
    BrowserModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [RestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
