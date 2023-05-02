package com.examly.springapp.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.UserModel.UserModel;
import com.examly.springapp.UserRepo.UserRepo;

@Service
public class UserService {
@Autowired
 private UserRepo userRepo;


public UserModel addUsers(UserModel user) {
// TODO Auto-generated method stub
 return userRepo.save(user);
}


public List<UserModel> getListOfUsers() {
// TODO Auto-generated method stub
 return userRepo.findAll();
}


public UserModel updatePolocy(UserModel user) {
  return userRepo.save(user);
}


public void deleteByUser(int  userId) {
userRepo.deleteById(userId);

}


public UserModel getByUser(int userId) {
 // TODO Auto-generated method stub
 return userRepo.findById(userId).get();
}

}