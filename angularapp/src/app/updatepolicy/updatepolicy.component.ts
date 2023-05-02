import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';
export class PolicyModel {
  policyid!: number;
  policyname!: string;
  appicableage!: number;
  claimamt!:number;
   yearsPlan!: number;
  rateofinterest!: string;
  policydetails!: string;
  termsandcondition!: string;
}


@Component({
  selector: 'app-updatepolicy',
  templateUrl: './updatepolicy.component.html',
  styleUrls: ['./updatepolicy.component.css']
})
export class UpdatepolicyComponent {

  policyForm!: FormGroup;
  policyid: any;
  policyname: any;
  applicableage: any;
  claimamt: any;
  yearsPlan: any;
  policydetails: any;
  termsandcondition: any;
  userdata: any;
  constructor(
  private formBuilder: FormBuilder,
  public addpolicy: AdminServiceService
   ) { }
  ngOnInit() {
     this.policyForm = this.formBuilder.group({
      policyid:[''],
      policyname: ['', Validators.required],
      applicableage: ['', Validators.required],
      claimamt: ['', Validators.required],
      yearsPlan: ['', Validators.required],
      rateofinterest: ['', Validators.required],
      policydetails: ['', Validators.required],
      termsandcondition: ['', Validators.required]
       });
      }
     onSubmit(): void {
    if (this.policyForm.valid) {
    this.addpolicy.Create(this.policyForm.value).subscribe(res => {
    console.log(res);
       });
      this.policyForm.reset();
      }
      else {
      alert('Form should not be null'); }
      }
      edit(): void {
        if (this.policyForm.valid) {
        this.addpolicy.Create(this.policyForm.value).subscribe(res => {
        console.log(res);
           });
          this.policyForm.reset();
          }
          else {
          alert('Form should not be null'); }
      }
}


