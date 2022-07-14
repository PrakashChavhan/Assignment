package com.yash.Que7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.Que5.MaxNumber;

public class TestMaxFromTwoArray {
public static void main(String[] args) {
	ApplicationContext obj = new ClassPathXmlApplicationContext("com/yash/Que7/Question7.xml");
	

	Class1 c1 = (Class1) obj.getBean("Merge1");
	Class2 c2 = (Class2) obj.getBean("Merge2");
int res[]=new int [c1.a.length+c2.b.length];
int pos = 0;  
for (int element : c1.a) //copying elements of secondArray using for-each loop  
{  
res[pos] = element;  
pos++;              //increases position by 1  
}  
for (int element : c2.b) //copying elements of firstArray using for-each loop  
{  
res[pos] = element;  
pos++;  
	
}
int max=res[0];
for(int i=0;i< res.length;i++) {
if(res[i]>max) {
	max=res[i];
}
}
System.out.println("The Maximum from two arrays:"+max);
}
}