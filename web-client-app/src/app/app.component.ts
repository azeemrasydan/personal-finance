import { Component } from '@angular/core';
import { Profile } from './entity/profile';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'web-client-app';
  profile : Profile = new Profile();
}
