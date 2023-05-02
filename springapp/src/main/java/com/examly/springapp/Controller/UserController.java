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

import com.examly.springapp.UserModel.UserModel;
import com.examly.springapp.UserService.UserService;

@RestController
//@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
  @Autowired
private UserService userService;

@PostMapping("/add")
 public UserModel addUser(@RequestBody UserModel user) {
	 return userService.addUsers(user);

}
 @GetMapping("/list")
public List<UserModel> getPolicy(){
 return userService.getListOfUsers();

}
@PutMapping("/update/{userId}")
public UserModel editPolicy(@PathVariable int userId,@RequestBody UserModel user) {
return userService.updatePolocy(user);

}
@DeleteMapping("/remove/{userId}")
public void deleteUser(@PathVariable int userId) {
userService.deleteByUser(userId);
}
 @GetMapping("/list/{userId}")
public UserModel getUser(@PathVariable int userId) {
return userService.getByUser(userId);
}
}

