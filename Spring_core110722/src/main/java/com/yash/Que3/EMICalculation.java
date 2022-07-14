package com.yash.Que3;

public class EMICalculation {
	 double principal, rate, time_year, emi;


public double getPrincipal() {
	return principal;
}

public void setPrincipal(double principal) {
	this.principal = principal;
}

public double getRate() {
	return rate;
}

public void setRate(double rate) {
	this.rate = rate;
}

public double getTime() {
	return time_year;
}

public void setTime(double time_year) {
	this.time_year= time_year;
}

public double getEmi() {
	return emi;
}

public void setEmi(double emi) {
	this.emi = emi;
}



public void calculateEmi() {
	  rate=rate/(12*100);
	  
      time_year=time_year*12;     
    
      emi= (principal*rate*Math.pow(1+rate,time_year))/(Math.pow(1+rate,time_year)-1);
      System.out.println("Monthly Emi is:" +emi);
      System.out.println("Total no.of Emi amount is:"+emi*12);
      System.out.println("Total EMI:"+time_year);
}

}
