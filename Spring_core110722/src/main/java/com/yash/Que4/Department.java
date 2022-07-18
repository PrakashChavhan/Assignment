package com.yash.Que4;

public class Department
{
	int dID;
	String dName;
	
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Department [dID=" + dID + ", dName=" + dName + "]";
	}
	


}
