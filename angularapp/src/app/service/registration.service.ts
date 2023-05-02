import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  Create(value: any) {
    throw new Error('Method not implemented.');
  }
  url2="http://localhost:8081/policy/addPolicy"
  url1: "http://localhost:8081/policy/getPolicy" = "http://localhost:8081/policy/getPolicy";
 
  constructor(private http:HttpClient) { }
  // regs
public doRegestration(user: any){
  return this.http.post("http://localhost:8081/user/add",user,{responseType:'text' as 'json'});
}
public buyPolicy(user: any){
  return this.http.post(this.url2,user);

}

public users(){
  return this.http.get(this.url1);

}

apiUrl="http://localhost:8081/doc/upload/policyId";
uploadDocument(file: File, documentType: string): Observable<any> {
  const formData: FormData = new FormData();
  formData.append('file', file, file.name);
  formData.append('documentType', documentType);
  return this.http.post(this.apiUrl, formData);
  }

}
