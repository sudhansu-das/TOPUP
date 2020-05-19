package org.sci.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonalLoan {
	@Id
int ploanId;
String plName;
public PersonalLoan()
{
	
}

public PersonalLoan(int ploanId, String plName) {
	
	this.ploanId = ploanId;
	this.plName = plName;
}

public int getPloanId() {
	return ploanId;
}
public void setPloanId(int ploanId) {
	this.ploanId = ploanId;
}
public String getPlName() {
	return plName;
}
public void setPlName(String plName) {
	this.plName = plName;
}

@Override
public String toString() {
	return "PersonalLoan [ploanId=" + ploanId + ", plName=" + plName + "]";
}

}
