package org.sci.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -629783300311876607L;
	@Id
	private String branch_Id;
	private String branch_Name;
	private String branch_Type;
	private String reg_id;

	public Branch() {

	}

	public Branch(String branch_Id, String branch_Name, String branch_Type, String reg_id) {
		
		this.branch_Id = branch_Id;
		this.branch_Name = branch_Name;
		this.branch_Type = branch_Type;
		this.reg_id = reg_id;
	}

	public String getBranch_Id() {
		return branch_Id;
	}

	public void setBranch_Id(String branch_Id) {
		this.branch_Id = branch_Id;
	}

	public String getbranch_Name() {
		return branch_Name;
	}

	public void setbranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}

	public String getbranch_Type() {
		return branch_Type;
	}

	public void setbranch_Type(String branch_Type) {
		this.branch_Type = branch_Type;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	@Override
	public String toString() {
		return "Branch [branch_Id=" + branch_Id + ", branch_Name=" + branch_Name + ", branch_Type=" + branch_Type
				+ ", reg_id=" + reg_id + "]";
	}

	
}
