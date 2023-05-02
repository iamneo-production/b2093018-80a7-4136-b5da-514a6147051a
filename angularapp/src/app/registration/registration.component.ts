import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, AbstractControl, Validators, FormBuilder } from '@angular/forms';
import { UserLogin } from './registration';
import { RegistrationService } from '../service/registration.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit{

//   user: UserLogin = new UserLogin('', '', '', '', '','');
//   message: any;
//   constructor(private service: RegistrationService) {}
//   ngOnInit(): void {}
//   public registerNow() {
//     let resp = this.service.doRegestration(this.loginForm.value);
//     resp.subscribe((data) => {
//       this.message = data;
//     });
//   }
// inteRegx=/^\d+$/
//   loginForm = new FormGroup({
//     email: new FormControl('', [Validators.required, Validators.maxLength(32),Validators.email]),
//     password: new FormControl('', [Validators.required,Validators.minLength(8),Validators.maxLength(32)]),
//     username: new FormControl('',[Validators.required]),
//     mobileNumber: new FormControl('', [Validators.required,Validators.minLength(10), Validators.maxLength(10),Validators.pattern(this.inteRegx)]),
//     userRole:new FormControl('',[Validators.required]),
//     cnfPassword:new FormControl('',[Validators.required,Validators.minLength(8),Validators.maxLength(32)]),
//   });
  // loginUser() {
  //   console.log(this.loginForm.value);
  // }
  // getControl(name:any):AbstractControl|null{
  //   return this.loginForm.get(name);
//   }
// }



loginForm!: FormGroup;
constructor(
private formBuilder: FormBuilder,
public addpolicy: RegistrationService
 ) { }
inteRegx=/^\d+$/

ngOnInit() {

   this.loginForm = this.formBuilder.group({
    email: new FormControl('', [Validators.required, Validators.maxLength(32),Validators.email]),
    password: new FormControl('', [Validators.required,Validators.pattern('((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,30})')]),
    username: new FormControl('',[Validators.required]),
    mobileNumber: new FormControl('', [Validators.required,Validators.minLength(10), Validators.maxLength(10),Validators.pattern(this.inteRegx), Validators.pattern("^[0-9]*$")]),
    userRole:new FormControl('',[Validators.required]),
    cnfPassword:new FormControl('',[Validators.required,Validators.minLength(8),Validators.maxLength(32)]),
     });
    }

  // loginUser() {
  //   console.log(this.loginForm.value);
  // }
  getControl(name:any):AbstractControl|null{
    return this.loginForm.get(name);
  }

  loginUser(): void {
  if (this.loginForm.valid) {
  this.addpolicy.doRegestration(this.loginForm.value).subscribe(resp => {
  console.log(resp);
     });
    this.loginForm.reset();
    }
    else {
    alert('Form should not be null'); }
      }
      
    
    }
    // ngOnInit(): void {}
    //   public registerNow() {
    //     let resp = this.service.doRegestration(this.loginForm.value);
    //     resp.subscribe((data) => {
    //       this.message = data;
    //     });
    //   }