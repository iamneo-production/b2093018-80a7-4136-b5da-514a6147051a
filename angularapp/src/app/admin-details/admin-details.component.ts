import { Component } from '@angular/core';

import { RegistrationService } from '../service/registration.service';
import { AdminServiceService } from '../admin-service.service';

@Component({
  selector: 'app-admin-details',
  templateUrl: './admin-details.component.html',
  styleUrls: ['./admin-details.component.css']
})
export class AdminDetailsComponent {
  policyid!: number;
  policyname!: string;
  applicableage!: string;
  claimamt!: number;
  yearsPlan!: number;
  rateofinterest!: string;
  policydetails!: string;
  termsandcondition!:string;



  policy1:any;
  constructor(private userdata:AdminServiceService){

    userdata.pol().subscribe((data)=>{
      console.log("data",data);
      this.policy1=data;

    });

    
  }

  delete1(policyid:number){
    console.log(policyid);
    this.userdata.delete(policyid).subscribe((result)=>{
      console.warn(result);
     
      
    }
    );
  }
  edit1(){
    let edit={
      "policyid":this.policyid,
      "policyname":this.policyname,
      "applicableage":this.applicableage,
      "claimamt":this.claimamt,
      "yearsPlan":this.yearsPlan,
      "rateofinterest":this.yearsPlan,
      "policydetails":this.policydetails,
      "termsandcondition":this.termsandcondition,
      
    }
    this.userdata.edit(this.policyid,edit).subscribe((res)=>{

      console.warn(res)
    }
    );
  }


}
