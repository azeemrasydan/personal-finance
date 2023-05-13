import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeNavbarComponent } from './shared/home-navbar/home-navbar.component';
import { JourneyComponent } from './pages/journey/journey.component';
import { SimulationComponent } from './pages/simulation/simulation.component';
import { PlanComponent } from './pages/plan/plan.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeNavbarComponent,
    JourneyComponent,
    SimulationComponent,
    PlanComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
