package org.sci.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String acc_No;
	private int age;
	private int bank_Rel;
	private String branchId;
	private String cust_Name;
	private String mobile;
	private String mail_Id;
	private int tot_Noof_Installment;
	private double installment_Amount;
	private boolean NPA;
	private double income;
	private double per_Amount_Deserve;
	private double repayment_Capsity;
	@Transient
	private String loanType;
	private int number_Of_Installment_Paid;
	private boolean document_Perfected;
	private int credit_Score;
	@Transient
	private double topup_Eligible_Amount;
	private int mortorium_In_Months;
	private int door_To_Door_Repayment_Tenure;
	private double repayment_Capacity;
	@Transient
	private int max_Age;
	@Transient
	private int min_Age;
	@Transient	
	private List<String> mul_Loan_Type = new ArrayList<String>();	
	private double loan_Amount;
	public double getLoan_Amount() {
		return loan_Amount;
	}
	public void setLoan_Amount(double loan_Amount) {
		this.loan_Amount = loan_Amount;
	}
	public boolean isNPA() {
		return NPA;
	}
	public void setNPA(boolean nPA) {
		NPA = nPA;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getPer_Amount_Deserve() {
		return per_Amount_Deserve;
	}
	public void setPer_Amount_Deserve(double per_Amount_Deserve) {
		this.per_Amount_Deserve = per_Amount_Deserve;
	}
	public double getRepayment_Capsity() {
		return repayment_Capsity;
	}
	public void setRepayment_Capsity(double repayment_Capsity) {
		this.repayment_Capsity = repayment_Capsity;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMail_Id() {
		return mail_Id;
	}
	public void setMail_Id(String mail_Id) {
		this.mail_Id = mail_Id;
	}
	public List<String> getMul_Loan_Type() {
		return mul_Loan_Type;
	}
	public void setMul_Loan_Type(List<String> mul_Loan_Type) {
		this.mul_Loan_Type = mul_Loan_Type;
	}
	public int getMax_Age() {
		return max_Age;
	}
	public void setMax_Age(int max_Age) {
		this.max_Age = max_Age;
	}
	public int getMin_Age() {
		return min_Age;
	}
	public void setMin_Age(int min_Age) {
		this.min_Age = min_Age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBank_Rel() {
		return bank_Rel;
	}
	public void setBank_Rel(int bank_Rel) {
		this.bank_Rel = bank_Rel;
	}
	
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	public int getNumber_Of_Installment_Paid() {
		return number_Of_Installment_Paid;
	}
	public void setNumber_Of_Installment_Paid(int number_Of_Installment_Paid) {
		this.number_Of_Installment_Paid = number_Of_Installment_Paid;
	}
	public boolean isDocument_Perfected() {
		return document_Perfected;
	}
	public void setDocument_Perfected(boolean document_Perfected) {
		this.document_Perfected = document_Perfected;
	}
	public int getCredit_Score() {
		return credit_Score;
	}
	public void setCredit_Score(int credit_Score) {
		this.credit_Score = credit_Score;
	}
	public double getTopup_Eligible_Amount() {
		return topup_Eligible_Amount;
	}
	public void setTopup_Eligible_Amount(double topup_Eligible_Amount) {
		this.topup_Eligible_Amount = topup_Eligible_Amount;
	}
	public int getMortorium_In_Months() {
		return mortorium_In_Months;
	}
	public void setMortorium_In_Months(int mortorium_In_Months) {
		this.mortorium_In_Months = mortorium_In_Months;
	}
	public int getDoor_To_Door_Repayment_Tenure() {
		return door_To_Door_Repayment_Tenure;
	}
	public void setDoor_To_Door_Repayment_Tenure(int door_To_Door_Repayment_Tenure) {
		this.door_To_Door_Repayment_Tenure = door_To_Door_Repayment_Tenure;
	}
	public double getRepayment_Capacity() {
		return repayment_Capacity;
	}
	public void setRepayment_Capacity(double repayment_Capacity) {
		this.repayment_Capacity = repayment_Capacity;
	}
	
	public int getTot_Noof_Installment() {
		return tot_Noof_Installment;
	}
	public void setTot_Noof_Installment(int tot_Noof_Installment) {
		this.tot_Noof_Installment = tot_Noof_Installment;
	}
	public double getInstallment_Amount() {
		return installment_Amount;
	}
	public void setInstallment_Amount(double installment_Amount) {
		this.installment_Amount = installment_Amount;
	}
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", acc_No=" + acc_No + ", age=" + age + ", bank_Rel=" + bank_Rel
				+ ", branchId=" + branchId + ", cust_Name=" + cust_Name + ", mobile=" + mobile + ", mail_Id=" + mail_Id
				+ ", tot_Noof_Installment=" + tot_Noof_Installment + ", installment_Amount=" + installment_Amount
				+ ", NPA=" + NPA + ", income=" + income + ", per_Amount_Deserve=" + per_Amount_Deserve
				+ ", repayment_Capsity=" + repayment_Capsity + ", loanType=" + loanType
				+ ", number_Of_Installment_Paid="
				+ number_Of_Installment_Paid + ", document_Perfected=" + document_Perfected + ", credit_Score="
				+ credit_Score + ", topup_Eligible_Amount=" + topup_Eligible_Amount + ", mortorium_In_Months="
				+ mortorium_In_Months + ", door_To_Door_Repayment_Tenure=" + door_To_Door_Repayment_Tenure
				+ ", repayment_Capacity=" + repayment_Capacity + ", max_Age=" + max_Age + ", min_Age=" + min_Age
				+ ", mul_Loan_Type=" + mul_Loan_Type + ", loan_Amount=" + loan_Amount + "]";
	}
	
}
