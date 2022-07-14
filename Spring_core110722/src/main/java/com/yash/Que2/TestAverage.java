package com.yash.Que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAverage {
	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/yash/Que2/Question2.xml");

		Average a = (Average) obj.getBean("checkaverage");
		a.averageofNumbers();
	}


}
