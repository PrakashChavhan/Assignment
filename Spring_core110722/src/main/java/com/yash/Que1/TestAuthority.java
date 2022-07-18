package com.yash.Que1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuthority {
public static void main(String[] args) {
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	Authority a=(Authority) ac.getBean("admin");
	a.message();
	Authority b=(Authority) ac.getBean("user");
	b.message();
	
	
	
	
}
}
