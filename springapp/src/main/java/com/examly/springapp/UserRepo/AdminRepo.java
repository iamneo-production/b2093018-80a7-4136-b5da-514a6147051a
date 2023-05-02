package com.examly.springapp.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.UserModel.AdminModel;



@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Integer>{
}

