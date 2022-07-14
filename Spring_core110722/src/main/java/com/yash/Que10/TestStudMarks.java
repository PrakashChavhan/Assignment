package com.yash.Que10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudMarks {
public static void main(String[] args) {
	ApplicationContext obj = new ClassPathXmlApplicationContext("com/yash/Que10/Question10.xml");

	Stud a = (Stud) obj.getBean("checkStud");
		a.show();
		a.check();
}
}
