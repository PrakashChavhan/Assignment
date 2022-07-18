package com.yash.Que4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.yash.Que4.Department;

@Component
public class Employee 
{
	public int eID;
	public String eName;
	public double eSalary;
	
	@Autowired
	Department dept;
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", eName=" + eName + ", eSalary=" + eSalary + ", dept=" + dept + "]";
	}
	

}
