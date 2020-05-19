package org.sci.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoandetailsInfo {
	@Id
private long id;
private String acc_No;
private String name_Borrower;
private String name_Guarantor;
private String adress_Guarantor;
private String address_Customer;
private String email;
private String mobile;
private String pan;
private String aadhar;
private String voterId;
private String DL;
private String passport_Number;
private String passport_Expiry_Date;
public LoandetailsInfo()
{
	
}
public LoandetailsInfo(long id, String acc_No, String name_Borrower, String name_Guarantor, String adress_Guarantor,
		String address_Customer, String email, String mobile, String pan, String aadhar, String voterId, String dL,
		String passport_Number, String passport_Expiry_Date) {
	super();
	this.id = id;
	this.acc_No = acc_No;
	this.name_Borrower = name_Borrower;
	this.name_Guarantor = name_Guarantor;
	this.adress_Guarantor = adress_Guarantor;
	this.address_Customer = address_Customer;
	this.email = email;
	this.mobile = mobile;
	this.pan = pan;
	this.aadhar = aadhar;
	this.voterId = voterId;
	DL = dL;
	this.passport_Number = passport_Number;
	this.passport_Expiry_Date = passport_Expiry_Date;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getAcc_No() {
	return acc_No;
}
public void setAcc_No(String acc_No) {
	this.acc_No = acc_No;
}
public String getName_Borrower() {
	return name_Borrower;
}
public void setName_Borrower(String name_Borrower) {
	this.name_Borrower = name_Borrower;
}
public String getName_Guarantor() {
	return name_Guarantor;
}
public void setName_Guarantor(String name_Guarantor) {
	this.name_Guarantor = name_Guarantor;
}
public String getAdress_Guarantor() {
	return adress_Guarantor;
}
public void setAdress_Guarantor(String adress_Guarantor) {
	this.adress_Guarantor = adress_Guarantor;
}
public String getAddress_Customer() {
	return address_Customer;
}
public void setAddress_Customer(String address_Customer) {
	this.address_Customer = address_Customer;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getPan() {
	return pan;
}
public void setPan(String pan) {
	this.pan = pan;
}
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}
public String getVoterId() {
	return voterId;
}
public void setVoterId(String voterId) {
	this.voterId = voterId;
}
public String getDL() {
	return DL;
}
public void setDL(String dL) {
	DL = dL;
}
public String getPassport_Number() {
	return passport_Number;
}
public void setPassport_Number(String passport_Number) {
	this.passport_Number = passport_Number;
}
public String getPassport_Expiry_Date() {
	return passport_Expiry_Date;
}
public void setPassport_Expiry_Date(String passport_Expiry_Date) {
	this.passport_Expiry_Date = passport_Expiry_Date;
}


@Override
public String toString() {
	return "LoandetailsInfo [id=" + id + ", acc_No=" + acc_No + ", name_Borrower=" + name_Borrower + ", name_Guarantor="
			+ name_Guarantor + ", adress_Guarantor=" + adress_Guarantor + ", address_Customer=" + address_Customer
			+ ", email=" + email + ", mobile=" + mobile + ", pan=" + pan + ", aadhar=" + aadhar + ", voterId=" + voterId
			+ ", DL=" + DL + ", passport_Number=" + passport_Number + ", passport_Expiry_Date=" + passport_Expiry_Date
			+ "]";
}

}
