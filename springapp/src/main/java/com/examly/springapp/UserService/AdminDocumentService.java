package com.examly.springapp.UserService;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.examly.springapp.UserModel.DocumentModel;
import com.examly.springapp.UserModel.PolicyModel;
import com.examly.springapp.UserRepo.DocumentRepo;
import com.examly.springapp.UserRepo.PolicyRepo;

@Service
public class AdminDocumentService {
              @Autowired
              private DocumentRepo adminrepository;
              @Autowired
              private PolicyRepo policyservice;
              public DocumentModel saveDocument(MultipartFile file, int policyId) throws IOException{
              String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    String fileType = file.getContentType();
              byte[] fileData = file.getBytes();
              DocumentModel nfile = new DocumentModel();
              
    nfile.setDocumenttype(fileType);
    nfile.setDocumentupload(fileData);
    PolicyModel l=policyservice.findById(policyId).get();
    nfile.setPolicy(l);
              return adminrepository.save(nfile);
              }
              public List<DocumentModel> viewDocument(){

                return adminrepository.findAll();
                }
}
