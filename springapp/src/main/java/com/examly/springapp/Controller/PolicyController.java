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

import com.examly.springapp.UserModel.PolicyModel;
import com.examly.springapp.UserService.PolicyService;



@RestController
//@RequestMapping("/policy")
@CrossOrigin(origins="http://localhost:4200")
public class PolicyController {
@Autowired
private PolicyService policyService;

@PostMapping("/addPolicy")
public PolicyModel addPolicy(@RequestBody PolicyModel policy) {
return policyService.addPolicyModel(policy);

}
@GetMapping("/getPolicy")
public List<PolicyModel> getPolicy(){
return policyService.getListOfPolicy();

}
@PutMapping("/updatePolicy/{policyId}")
public PolicyModel editPolicy(@PathVariable int policyId,@RequestBody PolicyModel policy) {
return policyService.updatePolocy(policy);
}
@DeleteMapping("/deletePolicy/{policyId}")
public void deletePolicy(@PathVariable int policyId) {
policyService.deleteByPolicy(policyId);
}
@GetMapping("/getPolicy/{policyId}")
public PolicyModel getPolicy(@PathVariable int policyId) {
return policyService.getByPolicy(policyId);

}

}
