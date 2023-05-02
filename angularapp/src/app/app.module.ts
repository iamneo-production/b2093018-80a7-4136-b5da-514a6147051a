import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PolicyComponent } from './policy/policy.component';
import { ViewPolicyComponent } from './view-policy/view-policy.component';
import { AdminComponent } from './admin/admin.component';
import { AddPolicyComponent } from './add-policy/add-policy.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
// import {} from 'return this.httpClient.get('url');'
import {HttpClientModule }  from '@angular/common/http';
import { MyProfileComponent } from './my-profile/my-profile.component';
import { MyPolicyComponent } from './my-policy/my-policy.component';
import { ApplicantDetailsComponent } from './applicant-details/applicant-details.component';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { UpdatepolicyComponent } from './updatepolicy/updatepolicy.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    PolicyComponent,
    ViewPolicyComponent,
    AdminComponent,
    AddPolicyComponent,
    MyProfileComponent,
    MyPolicyComponent,
    ApplicantDetailsComponent,
    AdminDetailsComponent,
    UpdatepolicyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule, NgbModule, FontAwesomeModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
