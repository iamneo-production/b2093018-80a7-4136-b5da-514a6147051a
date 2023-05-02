package com.examly.springapp.UserModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyModel {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 int policyId;
String policytype;
String applicantName;
 String applicantAddress;
String applicantMobile;
String applicantEmail;
String applicantAadhaar;
String applicantPan;
String applicantSalary;
public int getPolicyId() {
	return policyId;
}
public void setPolicyId(int policyId) {
	this.policyId = policyId;
}
public String getPolicytype() {
	return policytype;
}
public void setPolicytype(String policytype) {
	this.policytype = policytype;
}
public String getApplicantName() {
	return applicantName;
}
public void setApplicantName(String applicantName) {
	this.applicantName = applicantName;
}
public String getApplicantAddress() {
	return applicantAddress;
}
public void setApplicantAddress(String applicantAddress) {
	this.applicantAddress = applicantAddress;
}
public String getApplicantMobile() {
	return applicantMobile;
}
public void setApplicantMobile(String applicantMobile) {
	this.applicantMobile = applicantMobile;
}
public String getApplicantEmail() {
	return applicantEmail;
}
public void setApplicantEmail(String applicantEmail) {
	this.applicantEmail = applicantEmail;
}
public String getApplicantAadhaar() {
	return applicantAadhaar;
}
public void setApplicantAadhaar(String applicantAadhaar) {
	this.applicantAadhaar = applicantAadhaar;
}
public String getApplicantPan() {
	return applicantPan;
}
public void setApplicantPan(String applicantPan) {
	this.applicantPan = applicantPan;
}
public String getApplicantSalary() {
	return applicantSalary;
}
public void setApplicantSalary(String applicantSalary) {
	this.applicantSalary = applicantSalary;
}
public PolicyModel(int policyId, String policytype, String applicantName, String applicantAddress,
		String applicantMobile, String applicantEmail, String applicantAadhaar, String applicantPan,
		String applicantSalary) {
	super();
	this.policyId = policyId;
	this.policytype = policytype;
	this.applicantName = applicantName;
	this.applicantAddress = applicantAddress;
	this.applicantMobile = applicantMobile;
	this.applicantEmail = applicantEmail;
	this.applicantAadhaar = applicantAadhaar;
	this.applicantPan = applicantPan;
	this.applicantSalary = applicantSalary;
}
public PolicyModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PolicyModel [policyId=" + policyId + ", policytype=" + policytype + ", applicantName=" + applicantName
			+ ", applicantAddress=" + applicantAddress + ", applicantMobile=" + applicantMobile + ", applicantEmail="
			+ applicantEmail + ", applicantAadhaar=" + applicantAadhaar + ", applicantPan=" + applicantPan
			+ ", applicantSalary=" + applicantSalary + "]";
}

}