package com.yash.Que6;

public class StringVowels 
{
	String str [] ;

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	
	public void show()
	{
		for(int i = 0 ; i < str.length ; i++)
		{
			System.out.println(str[i]);
		}
	}
	
	public void display()
	{
		for(String a :str)
		{
			String str1 = a.replaceAll("[aeiouAEIOU]", "");
			if(a.equals(str1))
				System.out.println(str1);
		}
		
	}
}
