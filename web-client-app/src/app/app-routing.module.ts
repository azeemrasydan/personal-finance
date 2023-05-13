import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JourneyComponent } from './pages/journey/journey.component';
import { SimulationComponent } from './pages/simulation/simulation.component';
import { PlanComponent } from './pages/plan/plan.component';

const routes: Routes = [
  {
    path: 'journey',
    title: 'Financial Journey',
    component: JourneyComponent
  },
  {
    path: 'simulation',
    title: 'Financial Simulation',
    component: SimulationComponent
  },
  {
    path: 'plan',
    title: 'Financial Plan',
    component: PlanComponent
  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
