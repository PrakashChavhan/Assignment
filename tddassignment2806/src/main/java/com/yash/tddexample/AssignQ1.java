package com.yash.tddexample;

public class AssignQ1 {
int hcf=0;
	public int HCF(int a, int b) {
		 for(int i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
		return hcf;
	}
	
	
}
