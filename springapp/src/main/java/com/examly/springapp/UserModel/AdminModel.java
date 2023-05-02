package com.examly.springapp.UserModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policydetails")
public class AdminModel {
@Id
private int policyid;
private String policyname;
private String applicableage;
private int claimamt;
private int yearsPlan;
private String rateofinterest;
private String policydetails;
private String termsandcondition;
public int getPolicyid() {
	return policyid;
}
public void setPolicyid(int policyid) {
	this.policyid = policyid;
}
public String getPolicyname() {
	return policyname;
}
public void setPolicyname(String policyname) {
	this.policyname = policyname;
}
public String getApplicableage() {
	return applicableage;
}
public void setApplicableage(String applicableage) {
	this.applicableage = applicableage;
}
public int getClaimamt() {
	return claimamt;
}
public void setClaimamt(int claimamt) {
	this.claimamt = claimamt;
}
public int getYearsPlan() {
	return yearsPlan;
}
public void setYearsPlan(int yearsPlan) {
	this.yearsPlan = yearsPlan;
}
public String getRateofinterest() {
	return rateofinterest;
}
public void setRateofinterest(String rateofinterest) {
	this.rateofinterest = rateofinterest;
}
public String getPolicydetails() {
	return policydetails;
}
public void setPolicydetails(String policydetails) {
	this.policydetails = policydetails;
}
public String getTermsandcondition() {
	return termsandcondition;
}
public void setTermsandcondition(String termsandcondition) {
	this.termsandcondition = termsandcondition;
}

public AdminModel(int policyid, String policyname, String applicableage, int claimamt, int yearsPlan,
		String rateofinterest, String policydetails, String termsandcondition) {
	super();
	this.policyid = policyid;
	this.policyname = policyname;
	this.applicableage = applicableage;
	this.claimamt = claimamt;
	this.yearsPlan = yearsPlan;
	this.rateofinterest = rateofinterest;
	this.policydetails = policydetails;
	this.termsandcondition = termsandcondition;
}

public AdminModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PolicyDetail [policyid=" + policyid + ", policyname=" + policyname + ", applicableage=" + applicableage
			+ ", claimamt=" + claimamt + ", yearsPlan=" + yearsPlan + ", rateofinterest=" + rateofinterest
			+ ", policydetails=" + policydetails + ", termsandcondition=" + termsandcondition + "]";
}


}
