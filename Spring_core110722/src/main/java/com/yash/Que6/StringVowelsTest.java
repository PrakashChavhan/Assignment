package com.yash.Que6;

/*
 * WAP to inject multiple names to a beans and break the names in to array of string and find
 * out the string which is having no vowel in it.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringVowelsTest 
{
	public static void main(String[] args)
	{
		ApplicationContext objAC = new ClassPathXmlApplicationContext("com/yash/Que6/applicationContext.xml");
		
		StringVowels cv = (StringVowels) objAC.getBean("vowel");
		cv.display();
	}
}
