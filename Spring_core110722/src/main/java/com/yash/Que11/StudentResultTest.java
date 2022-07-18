package com.yash.Que11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentResultTest 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext objAC = new ClassPathXmlApplicationContext("com/yash/Que11/applicationContext.xml");
		
		List<Student> slist = new ArrayList<Student>();
		Student s1 = (Student) objAC.getBean("stum1");
		

		slist.add(s1);
		
		for(Student s :slist) {
			System.out.println(s.stuName+" "+s.res.total_marks);
			
		}
		System.out.println("On the basis of total marks");
		List<Student> sortedlist = slist.stream().sorted().collect(Collectors.toList());
		for (Student w : sortedlist) {
		System.out.println(w.res.total_marks);
	}
}
}