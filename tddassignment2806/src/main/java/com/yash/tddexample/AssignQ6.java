package com.yash.tddexample;

public class AssignQ6 {
int count;
	public int countVowels(String string) {
		 for (int i=0 ; i<string.length(); i++){
	         char ch = string.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
		return count;
	}

}
