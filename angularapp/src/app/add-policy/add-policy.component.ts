import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
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
  selector: 'app-add-policy',
  templateUrl: './add-policy.component.html',
  styleUrls: ['./add-policy.component.css']
})
export class AddPolicyComponent implements OnInit {

  policyForm!: FormGroup;
constructor(
private formBuilder: FormBuilder,
public addpolicy: AdminServiceService
 ) { }
ngOnInit() {
   this.policyForm = this.formBuilder.group({
    policyid:['',Validators.required],
    policyname: ['',Validators.required],
    applicableage: ['',Validators.required],
    claimamt: ['',Validators.required],
    yearsPlan: ['',Validators.required],
    rateofinterest: ['',Validators.required],
    policydetails: ['',Validators.required],
    termsandcondition: ['',Validators.required]
     });
    }
    getControl(name:any):AbstractControl|null{
      return this.policyForm.get(name);
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
    
    }


