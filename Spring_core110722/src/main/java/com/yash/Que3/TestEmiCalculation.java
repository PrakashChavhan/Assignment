package com.yash.Que3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestEmiCalculation {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	ApplicationContext obj = new ClassPathXmlApplicationContext("com/yash/Que3/Question3.xml");

	EMICalculation a = (EMICalculation) obj.getBean("checkEmicalculation");
	System.out.println("Please enter time_Year :");
 a.time_year=sc.nextInt();
 
	a.calculateEmi();
	
}
}
