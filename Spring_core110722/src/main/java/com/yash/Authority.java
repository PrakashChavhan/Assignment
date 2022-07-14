package com.yash;

import javax.annotation.PostConstruct;

public class Authority {
String person;

public String getPerson() {
	return person;
}


public void setPerson(String person) {
	this.person = person;
}
public void message() {
	System.out.println("These is :"+person);
}


}
