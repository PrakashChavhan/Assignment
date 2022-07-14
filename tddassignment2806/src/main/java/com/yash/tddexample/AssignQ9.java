package com.yash.tddexample;

public class AssignQ9 {

	public String removeSpecial(String string) {
		string = string.replaceAll("[-+^@$-]*", ""); 
	
		return string;
	}

}
