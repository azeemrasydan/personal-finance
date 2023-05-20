import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeNavbarComponent } from './shared/home-navbar/home-navbar.component';
import { JourneyComponent } from './pages/journey/journey.component';
import { SimulationComponent } from './pages/simulation/simulation.component';
import { PlanComponent } from './pages/plan/plan.component';
import { FormsModule } from '@angular/forms';
import { LeftSidebarComponent } from './shared/left-sidebar/left-sidebar.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeNavbarComponent,
    JourneyComponent,
    SimulationComponent,
    PlanComponent,
    LeftSidebarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
