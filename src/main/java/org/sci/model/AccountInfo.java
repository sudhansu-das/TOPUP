package org.sci.model;

import java.io.Serializable;

public class AccountInfo implements Serializable
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int totGen;
private int totCont;
private int totInter;
private int totNotInter;
private int totCoverted;
public AccountInfo()
{
	
}
public AccountInfo(int totGen, int totCont, int totInter, int totNotInter, int totCoverted) {
	super();
	this.totGen = totGen;
	this.totCont = totCont;
	this.totInter = totInter;
	this.totNotInter = totNotInter;
	this.totCoverted = totCoverted;
}
public int getTotGen() {
	return totGen;
}
public void setTotGen(int totGen) {
	this.totGen = totGen;
}
public int getTotCont() {
	return totCont;
}
public void setTotCont(int totCont) {
	this.totCont = totCont;
}
public int getTotInter() {
	return totInter;
}
public void setTotInter(int totInter) {
	this.totInter = totInter;
}
public int getTotNotInter() {
	return totNotInter;
}
public void setTotNotInter(int totNotInter) {
	this.totNotInter = totNotInter;
}
public int getTotCoverted() {
	return totCoverted;
}
public void setTotCoverted(int totCoverted) {
	this.totCoverted = totCoverted;
}
@Override
public String toString() {
	return "AccountInfo [totGen=" + totGen + ", totCont=" + totCont + ", totInter=" + totInter + ", totNotInter="
			+ totNotInter + ", totCoverted=" + totCoverted + "]";
}


}
