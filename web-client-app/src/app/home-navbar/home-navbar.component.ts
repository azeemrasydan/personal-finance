import { Component, Input } from '@angular/core';
import { Profile } from '../entity/Profile';

@Component({
  selector: 'app-home-navbar',
  templateUrl: './home-navbar.component.html',
  styleUrls: ['./home-navbar.component.css']
})
export class HomeNavbarComponent {
  @Input() appTitle!: string;
  @Input() appProfile!: Profile
}
