package com.examly.springapp.UserRepo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.UserModel.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer>{
 Optional<UserModel> findByEmail(String email);

}