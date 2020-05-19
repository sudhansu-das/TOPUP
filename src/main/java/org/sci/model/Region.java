package org.sci.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Region implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6670585388026176047L;
	@Id
	private String reg_id;
	private String regionname;

	public Region() {

	}

	public Region(String reg_id, String regionname) {

		this.reg_id = reg_id;
		this.regionname = regionname;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	@Override
	public String toString() {
		return "Region [reg_id=" + reg_id + ", regionname=" + regionname + "]";
	}

}
