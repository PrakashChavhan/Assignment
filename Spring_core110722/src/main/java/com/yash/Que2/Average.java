package com.yash.Que2;

import javax.annotation.PostConstruct;

public class Average {
int no1;
int no2;
int no3;
int no4;

public Average() {
	super();
}
public int getNo1() {
	return no1;
}
public void setNo1(int no1) {
	this.no1 = no1;
}
public int getNo2() {
	return no2;
}
public void setNo2(int no2) {
	this.no2 = no2;
}
public int getNo3() {
	return no3;
}
public void setNo3(int no3) {
	this.no3 = no3;
}
public int getNo4() {
	return no4;
}
public void setNo4(int no4) {
	this.no4 = no4;
}
@PostConstruct
public void  averageofNumbers(){
	int avg=(no1+no2+no3+no4)/4;
	System.out.println("The average of Numbers:"+avg); 
}

}
