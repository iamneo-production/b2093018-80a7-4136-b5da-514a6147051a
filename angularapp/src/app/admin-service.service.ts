import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PolicyModel } from './add-policy/add-policy.component';
const URL: any ="http://localhost:8081/ad/admin/addPolicy";
@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {
   url="http://localhost:8081/ad/admin";
  constructor(private http : HttpClient) { }

   Create(data:PolicyModel):Observable<any> {
    return this.http.post(URL,data,{responseType : 'text'});
    
       }

    pol(){
      return this.http.get(this.url);
    }
    url1="http://localhost:8081/ad/admin/deletePolicy";
    delete(policyid:number){
      return this.http.delete(`${this.url1}/${policyid}`);
      
     }
     edit(policyid:number,data:any){
       return this.http.put(this.url+'/ad/admin/editPolicy/'+`/${policyid}`,data);
    }
   
      
  }



