package com.yash.tddexample;

public class AssignQ10 {
	String s="";
	public String ConcateStringInArray(String[] strings) {
		int a=strings.length-1;
	for(int i=0;i<strings.length;i++) {
		if(i==a) {
			s =s+strings[i];
		}else {
			s=s+strings[i]+"-";
		}
	
		
	}
	System.out.println(s);
		return s;
	}
public int mul(int a,int b) {
	return a*b;
}
}
