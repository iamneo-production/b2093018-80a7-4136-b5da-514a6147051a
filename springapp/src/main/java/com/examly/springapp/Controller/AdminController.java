package com.examly.springapp.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.UserModel.AdminModel;
import com.examly.springapp.UserService.AdminService;


@RestController
// @RequestMapping("/ad")
@CrossOrigin(origins ="http://localhost:4200")
public class AdminController {
@Autowired
private AdminService policyservice;
@GetMapping("/admin")
public List<AdminModel> getallpolicy(){
	return policyservice.getallpolicy();
}
@GetMapping("/admin/getpolicy/{policyid}")
public AdminModel getid(@PathVariable ("policyid") int policyid) {
return policyservice.getid(policyid);
}
@PostMapping("/admin/addPolicy")
public AdminModel addPolicy(@RequestBody AdminModel policy) {
return policyservice.addPolicy(policy);
}
@PutMapping("/admin/editPolicy/{policyid}")
public AdminModel editPolicy(@RequestBody AdminModel policy,@PathVariable("policyid")int policyid) {
return policyservice.editPolicy(policy);
}
@DeleteMapping("/admin/deletePolicy/{policyid}")
public void deletePolicyModel(@PathVariable("policyid")int policyid) {
policyservice.deletePolicyModel(policyid);
}
}

