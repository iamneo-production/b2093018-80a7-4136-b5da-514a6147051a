import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { PolicyComponent } from './policy/policy.component';
import { ViewPolicyComponent } from './view-policy/view-policy.component';
import { AdminComponent } from './admin/admin.component';
import { AddPolicyComponent } from './add-policy/add-policy.component';
import { MyProfileComponent } from './my-profile/my-profile.component';
import { MyPolicyComponent } from './my-policy/my-policy.component';
import { ApplicantDetailsComponent } from './applicant-details/applicant-details.component';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { UpdatepolicyComponent } from './updatepolicy/updatepolicy.component';

const routes: Routes = [
  {
    path:'', redirectTo:'login' , pathMatch:'full'
  },
  {
    path:'login',
     component:LoginComponent
  },
  {
    path:'registration',
    component:RegistrationComponent
  },
  {
    path:'policy',
    component:PolicyComponent
  },
  {
    path:'view-policy',
    component:ViewPolicyComponent
  },
  {
    path:'admin',
    component:AdminComponent
  },
  {
    path:'add-policy',
    component:AddPolicyComponent
  },
  {
    path:'my-profile',
    component:MyProfileComponent
  
  },
  {
    path:'my-policy',
    component:MyPolicyComponent
  },
  {
    path:'applicant-details',
    component:ApplicantDetailsComponent
  },
  
    {
      path:'admin-details',
      component:AdminDetailsComponent
    },
    {
      path:'updatepolicy',
      component:UpdatepolicyComponent
    
    }
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
