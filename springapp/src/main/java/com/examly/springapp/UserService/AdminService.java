package com.examly.springapp.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.UserModel.AdminModel;
import com.examly.springapp.UserRepo.AdminRepo;


@Service
public class AdminService {
@Autowired
private AdminRepo policyrepo;
public List<AdminModel> getallpolicy() {
// TODO Auto-generated method stub
return policyrepo.findAll();
}
public AdminModel getid(int policyid) {
// TODO Auto-generated method stub
return policyrepo.findById(policyid).orElse(null);
}
public AdminModel addPolicy(AdminModel policy) {
// TODO Auto-generated method stub
return policyrepo.save(policy);
}
public AdminModel editPolicy(AdminModel policy) {
// TODO Auto-generated method stub
return policyrepo.save(policy);
}
public void deletePolicyModel(int policyid) {
// TODO Auto-generated method stub
policyrepo.deleteById(policyid);
}
}

