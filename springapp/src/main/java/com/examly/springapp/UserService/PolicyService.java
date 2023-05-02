package com.examly.springapp.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.UserModel.PolicyModel;
import com.examly.springapp.UserRepo.PolicyRepo;



@Service
public class PolicyService {
@Autowired

 private PolicyRepo policyService;

public PolicyModel addPolicyModel(PolicyModel policy) {
 return policyService.save(policy);
}


public List<PolicyModel> getListOfPolicy() {
 return policyService.findAll();
}

public PolicyModel updatePolocy(PolicyModel policy) {
return policyService.save(policy);
}


public void deleteByPolicy(int policyId) {
 policyService.deleteById(policyId);
}


public PolicyModel getByPolicy(int policyId) {
return policyService.findById(policyId).get();
}



}