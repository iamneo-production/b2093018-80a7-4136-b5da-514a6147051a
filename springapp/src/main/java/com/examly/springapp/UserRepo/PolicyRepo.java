package com.examly.springapp.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.UserModel.PolicyModel;



@Repository
public interface PolicyRepo extends JpaRepository<PolicyModel,Integer> {


}