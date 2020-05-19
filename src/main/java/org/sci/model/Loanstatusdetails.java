package org.sci.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loanstatusdetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6183313262916588952L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String branch_Id;

	private int bank_Rel;
	private String firstName;
	private String accID;
	private String res_Type;
	private String loanType;
	private String mobile;
	private String mail_Id;
	private double top_Up_Loan_Amount;
	private boolean sms_Sent;
	private boolean mail_Sent;
	private Date sms_Time;
	private Date mail_Time;
	private boolean interested;
	private boolean notInterested;
	private boolean generated;
	private boolean otherLoan;
	private int qtr;
	private int year;

	public Loanstatusdetails() {

	}
	public Loanstatusdetails(long id, String branch_Id, int bank_Rel, String firstName, String accID, String res_Type,
			String loanType, String mobile, String mail_Id, double top_Up_Loan_Amount, boolean sms_Sent,
			boolean mail_Sent, Date sms_Time, Date mail_Time, boolean interested, boolean notInterested,
			boolean generated, boolean otherLoan, int qtr, int year) {
		super();
		this.id = id;
		this.branch_Id = branch_Id;
		this.bank_Rel = bank_Rel;
		this.firstName = firstName;
		this.accID = accID;
		this.res_Type = res_Type;
		this.loanType = loanType;
		this.mobile = mobile;
		this.mail_Id = mail_Id;
		this.top_Up_Loan_Amount = top_Up_Loan_Amount;
		this.sms_Sent = sms_Sent;
		this.mail_Sent = mail_Sent;
		this.sms_Time = sms_Time;
		this.mail_Time = mail_Time;
		this.interested = interested;
		this.notInterested = notInterested;
		this.generated = generated;
		this.otherLoan = otherLoan;
		this.qtr = qtr;
		this.year = year;
	}



	public double getTop_Up_Loan_Amount() {
		return top_Up_Loan_Amount;
	}
	public void setTop_Up_Loan_Amount(double top_Up_Loan_Amount) {
		this.top_Up_Loan_Amount = top_Up_Loan_Amount;
	}
	public boolean isNotInterested() {
		return notInterested;
	}
	public void setNotInterested(boolean notInterested) {
		this.notInterested = notInterested;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBranch_Id() {
		return branch_Id;
	}
	public void setBranch_Id(String branch_Id) {
		this.branch_Id = branch_Id;
	}
	public int getBank_Rel() {
		return bank_Rel;
	}
	public void setBank_Rel(int bank_Rel) {
		this.bank_Rel = bank_Rel;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAccID() {
		return accID;
	}
	public void setAccID(String accID) {
		this.accID = accID;
	}

	public String getRes_Type() {
		return res_Type;
	}

	public void setRes_Type(String res_Type) {
		this.res_Type = res_Type;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
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

	public boolean isSms_Sent() {
		return sms_Sent;
	}

	public void setSms_Sent(boolean sms_Sent) {
		this.sms_Sent = sms_Sent;
	}

	public boolean isMail_Sent() {
		return mail_Sent;
	}

	public void setMail_Sent(boolean mail_Sent) {
		this.mail_Sent = mail_Sent;
	}

	public Date getSms_Time() {
		return sms_Time;
	}

	public void setSms_Time(Date sms_Time) {
		this.sms_Time = sms_Time;
	}

	public Date getMail_Time() {
		return mail_Time;
	}

	public void setMail_Time(Date mail_Time) {
		this.mail_Time = mail_Time;
	}

	public boolean isInterested() {
		return interested;
	}

	public void setInterested(boolean interested) {
		this.interested = interested;
	}

	public boolean isGenerated() {
		return generated;
	}

	public void setGenerated(boolean generated) {
		this.generated = generated;
	}

	public boolean isOtherLoan() {
		return otherLoan;
	}

	public void setOtherLoan(boolean otherLoan) {
		this.otherLoan = otherLoan;
	}

	public int getQtr() {
		return qtr;
	}

	public void setQtr(int qtr) {
		this.qtr = qtr;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "LoanStatusDetails [id=" + id + ", branch_Id=" + branch_Id + ", bank_Rel=" + bank_Rel + ", firstName="
				+ firstName + ", accID=" + accID + ", res_Type=" + res_Type + ", loanType=" + loanType + ", mobile="
				+ mobile + ", mail_Id=" + mail_Id + ", sms_Sent=" + sms_Sent + ", mail_Sent=" + mail_Sent
				+ ", sms_Time=" + sms_Time + ", mail_Time=" + mail_Time + ", interested=" + interested
				+ ", notInterested=" + notInterested + ", generated=" + generated + ", otherLoan=" + otherLoan
				+ ", qtr=" + qtr + ", year=" + year + "]";
	}

	

	
}
