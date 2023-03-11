import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookingComponent } from './booking/booking.component';
import { GuideDetailComponent } from './guide-detail/guide-detail.component';
import { GuideListComponent } from './guide-list/guide-list.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import { ReviewComponent } from './review/review.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'booking',
    component: BookingComponent,
  },
  {
    path: 'guideDetail',
    component: GuideDetailComponent,
  },
  {
    path: 'guideList',
    component: GuideListComponent,
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'profile',
    component: ProfileComponent,
  },
  {
    path: 'register',
    component: RegisterComponent,
  },
  {
    path: 'review',
    component: ReviewComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
