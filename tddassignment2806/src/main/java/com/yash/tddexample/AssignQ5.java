package com.yash.tddexample;

public class AssignQ5 {

	public boolean checkPythagoras(int a,int b,int c) {
		if(a * a + b * b == c * c ||
	            a * a + c * c == b * b ||
	            b * b + c * c == a * a)
		{
			return true;
		}else {
			return false;
		}
	}

}
