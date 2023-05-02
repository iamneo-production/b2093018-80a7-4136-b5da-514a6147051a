package com.examly.springapp.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.UserModel.DocumentModel;

@Repository
public interface DocumentRepo extends JpaRepository<DocumentModel,Integer> {



}
