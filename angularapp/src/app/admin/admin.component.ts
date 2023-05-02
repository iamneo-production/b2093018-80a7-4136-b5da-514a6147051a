import { Component } from '@angular/core';
import { RegistrationService } from '../service/registration.service';
import {faFacebook} from '@fortawesome/free-brands-svg-icons'
import {faTwitter} from '@fortawesome/free-brands-svg-icons'
import {faLinkedin} from '@fortawesome/free-brands-svg-icons'
import {faYoutube} from '@fortawesome/free-brands-svg-icons'
import {faInstagram} from '@fortawesome/free-brands-svg-icons'
import { faGithub } from '@fortawesome/free-brands-svg-icons';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
  faFacebook=faFacebook;
faYoutube=faYoutube
faTwitter=faTwitter;
faLinkedin=faLinkedin;
faInstagram=faInstagram;
faGithub=faGithub;
  profile:any;
  constructor(private policydata:RegistrationService){
    this.policydata.users().subscribe((data)=>{
      console.log("data",data);
       this.profile=data;
      })
      
   }
    
}
