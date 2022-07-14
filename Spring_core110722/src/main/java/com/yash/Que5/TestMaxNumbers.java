package com.yash.Que5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.Que3.EMICalculation;

public class TestMaxNumbers {
public static void main(String[] args) {
	ApplicationContext obj = new ClassPathXmlApplicationContext("com/yash/Que5/Question5.xml");

	MaxNumber a = (MaxNumber) obj.getBean("checkMax");
	
 a.findMax();
 System.out.println(a.a);

}
}
