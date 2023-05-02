package com.examly.springapp.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.examly.springapp.UserModel.DocumentModel;
import com.examly.springapp.UserService.AdminDocumentService;

@RestController
//@RequestMapping("/doc")
@CrossOrigin(origins="http://localhost:4200")
public class AdminDocument {
@Autowired
private AdminDocumentService adminservice;
@PostMapping("/upload/{policyId}")
public ResponseEntity<DocumentModel> addDocument(@RequestParam("file") MultipartFile file, @PathVariable int policyId) throws IOException {
DocumentModel nfile = adminservice.saveDocument(file,policyId);
return ResponseEntity.ok().body(nfile);
}
              @GetMapping("/viewDocument")
              public ResponseEntity<List<DocumentModel>> viewDocument(){
              List<DocumentModel> user=adminservice.viewDocument();
              return ResponseEntity.ok(user);
              }
              
}

