package com.yash.tddexample;

public class Assign2 {
	 String str="";
	public boolean stringPalindrome(String string, String string2) {
		 for (int i=0; i<string.length(); i++)
	      {
	     char   ch= string.charAt(i);
	        str= ch+str;
	      }
		 if(str.toLowerCase().equals(string2.toLowerCase()))
		 {
		return true;
	}else
	{
		return false;
		}
	
}
}
