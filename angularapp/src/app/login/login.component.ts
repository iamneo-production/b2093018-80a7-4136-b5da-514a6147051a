import { Component } from '@angular/core';
import { AbstractControl, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  
  
  // hehe(arg0: string, arg1:string){
  //   console.log(arg0,arg1);
  // }
  username!: string;
  password!: string;
  constructor(private router: Router){}

login(){
  

if(this.username ==='admin' && this.password === 'admin'){

this.router.navigate(['/admin']);

 }else{

this.router.navigate(['/policy']);

 }
//  console.log(this.loginForm.value);

 }
//  getControl(name:any):AbstractControl|null{
//   return this.loginForm.get(name);
// }


// loginForm = new FormGroup({
//   email: new FormControl('', [Validators.required, Validators.maxLength(32),Validators.email]),

// });


}