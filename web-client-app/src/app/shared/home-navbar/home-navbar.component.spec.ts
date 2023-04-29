import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeNavbarComponent } from './home-navbar.component';
import { Profile } from 'src/app/entity/Profile';

describe('HomeNavbarComponent', () => {
  let component: HomeNavbarComponent;
  let fixture: ComponentFixture<HomeNavbarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeNavbarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HomeNavbarComponent);
    component = fixture.componentInstance;

    component.appProfile = new Profile();
    
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
