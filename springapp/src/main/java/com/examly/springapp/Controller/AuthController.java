package com.examly.springapp.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.UserModel.UserModel;
import com.examly.springapp.UserRepo.UserRepo;

@RestController
@RequestMapping("auth")
@CrossOrigin(origins="http://localhost:4200")
public class AuthController {
@Autowired
private UserRepo userRepository;

@PostMapping("/signin")
public ResponseEntity<String> signin(@RequestBody UserModel loginModel) {
if (isUserPresent(loginModel)) {
return ResponseEntity.ok("User signin success");
} else {
return ResponseEntity.badRequest().body("Invalid email or password");
}
}

@PostMapping("/signup/user")
public ResponseEntity<String> signupUser(@RequestBody UserModel userModel) {
userModel.setUserRole("USER");
signupUser(userModel);
return ResponseEntity.ok("User signup success");
}

//@PostMapping("/signup/admin")
//public ResponseEntity<String> signupAdmin(@RequestBody UserModel userModel) {
//userModel.setUserRole("ADMIN");
//signupAdmin(userModel);
//return ResponseEntity.ok("Admin signup success");
//}
private boolean isUserPresent(UserModel loginModel) {
Optional<UserModel> userOptional = userRepository.findByEmail(loginModel.getEmail());
if (userOptional.isPresent()) {
UserModel user = userOptional.get();
return user.getPassword().equals(loginModel.getPassword());
}
return false;
}

private void saveUser(UserModel userModel) {
userRepository.save(userModel);
}
}
