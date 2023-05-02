import { Component } from '@angular/core';
import { Product } from '../Product';
import {faFacebook} from '@fortawesome/free-brands-svg-icons'
import {faTwitter} from '@fortawesome/free-brands-svg-icons'
import {faLinkedin} from '@fortawesome/free-brands-svg-icons'
import {faYoutube} from '@fortawesome/free-brands-svg-icons'
import {faInstagram} from '@fortawesome/free-brands-svg-icons'
import { faGithub } from '@fortawesome/free-brands-svg-icons';
import { AdminServiceService } from '../admin-service.service';


@Component({
  selector: 'app-view-policy',
  templateUrl: './view-policy.component.html',
  styleUrls: ['./view-policy.component.css']
})
export class ViewPolicyComponent {

  products:Product[]=[{Policy_Name :'Life insurance',Application_Age:'5 to 50',Number_of_years_plan :'10 years',Claim_Amount :20000},

{Policy_Name :'Terms insurance',Application_Age:'18 to 25',Number_of_years_plan :'25 years',Claim_Amount :30000},
 {Policy_Name :'LifeInsurance insurance',Application_Age:'10 to 40 ',Number_of_years_plan :'60 years',Claim_Amount :50000}];

 faFacebook=faFacebook;
faYoutube=faYoutube
faTwitter=faTwitter;
faLinkedin=faLinkedin;
faInstagram=faInstagram;
faGithub=faGithub;

// hey trying

policy1:any;
constructor(private userdata:AdminServiceService){

  userdata.pol().subscribe((data)=>{
    console.log("data",data);
    this.policy1=data;

  });

  
}
}
