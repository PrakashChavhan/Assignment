package com.yash.tddexample;

public class AssignQ7 {
int sum;
	public boolean checkPalindrome(int a) {
		int temp=a;
       while(a!=0) {
    	  int dig=a%10;
    	  sum=sum*10+dig;
    	  a=a/10;
       }
       if(temp==sum) {
		return true ;
       }else {
    	   return false;
       }
	}

}
