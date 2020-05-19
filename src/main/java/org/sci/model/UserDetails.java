package org.sci.model;

import java.io.Serializable;

public class UserDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private int otp;
	private String newPwd;
	private String oldPwd;
	public UserDetails()
	{
		
	}
	public UserDetails(String username, String password, int otp, String newPwd, String oldPwd) {
		super();
		this.username = username;
		this.password = password;
		this.otp = otp;
		this.newPwd = newPwd;
		this.oldPwd = oldPwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", password=" + password + ", otp=" + otp + ", newPwd=" + newPwd
				+ ", oldPwd=" + oldPwd + "]";
	}
	

}
