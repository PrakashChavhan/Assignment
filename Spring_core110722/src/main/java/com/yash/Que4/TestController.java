package com.yash.Que4;

/*
 *  WAP to perform demonstrate autowire. Use Two classes, first class Employee, second
 *  department now store all employee and department details. Print employee details in order
 *  by employee salary .
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.Que4.Employee;

public class TestController 
{
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<Employee>();
		ApplicationContext objAC = new ClassPathXmlApplicationContext("com/yash/Que4/applicationContext.xml");
		
		Employee e1 = (Employee) objAC.getBean("emp1");
		Employee e2 = (Employee) objAC.getBean("emp2");
		
		
		list.add(e1);
		list.add(e2);
		
		List<Employee> slist = list.stream().sorted((s1, s2) -> Double.compare(s1.eSalary, s2.eSalary)).toList();
		      
		for(Employee emp : slist)
		{
			System.out.println(emp.toString());
		}
	}
}
