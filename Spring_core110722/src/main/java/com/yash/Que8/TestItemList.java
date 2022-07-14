package com.yash.Que8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItemList {
public static void main(String[] args) {
	ApplicationContext obj=new ClassPathXmlApplicationContext("com/yash/Que8/Question8.xml");
	Item i=(Item) obj.getBean("ArrangeList");
	System.out.println("Original List:\n"+i.I_name);
	List<Object>sortedList=i.I_name.stream().sorted().collect(Collectors.toList()); 
	System.out.println("Sorted List:\n"+sortedList);
	
	 Set<Object>names=i.I_name.stream().collect(Collectors.toSet());
	 System.out.println("List Without Duplicates:\n"+names);
}
}
