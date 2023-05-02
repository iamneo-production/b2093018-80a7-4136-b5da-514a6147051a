import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, AbstractControl } from '@angular/forms';
// import { UserLogin } from '../registration/registration';
import { RegistrationService } from '../service/registration.service';
import { UserPolicy } from './ApplyPol';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-my-profile',
  templateUrl: './my-profile.component.html',
  styleUrls: ['./my-profile.component.css']
})
export class MyProfileComponent implements OnInit{
  user: UserPolicy = new UserPolicy(0, '', '', '', '','','','','');
  message: any;
  constructor(private service: RegistrationService) {}
  ngOnInit(): void {}
  public registerNow() {
    let resp = this.service.buyPolicy(this.loginForm.value);
    resp.subscribe((data) => {
      this.message = data;
    });
    Swal.fire("Your Details is Applyed Succussfully..");
  }
inteRegx=/^\d+$/
  loginForm = new FormGroup({
    policyId: new FormControl('',[Validators.required]),
    policytype: new FormControl('',[Validators.required]),
    applicantName: new FormControl('',[Validators.required]),
    applicantAddress: new FormControl('',[Validators.required]),
    applicantMobile: new FormControl('', [Validators.required,Validators.minLength(10), Validators.maxLength(10),Validators.pattern(this.inteRegx)]),
    applicantEmail: new FormControl('', [Validators.required, Validators.maxLength(32)]),
    applicantAadhaar: new FormControl('',[Validators.required]),
    applicantPan: new FormControl('',[Validators.required]),
    applicantSalary: new FormControl('', [Validators.required,Validators.minLength(10), Validators.maxLength(10),Validators.pattern(this.inteRegx)]),

  });
  UserInsurance() {
    console.log(this.loginForm.value);
  }
  getControl(name:any):AbstractControl|null{
    return this.loginForm.get(name);
  }

  file!: File;
  documenttype!: string;
  messages!: string;

onFileSelected(event: any): void {
this.file = event.target.files[0];
}

uploadDocument(): void {
if (this.file && this.documenttype) {
this.service.uploadDocument(this.file, this.documenttype)
.subscribe(
response => this.messages = response.messages,
error => this.messages = 'Failed to upload document!'
);

}

}
}