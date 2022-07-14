package com.yash.tddexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class AssignmentQ3 {
//@Test
//public void CheckEmailPass() {
//	AssignQ3 a=new AssignQ3();
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter First String:\n");
//	String aa=sc.nextLine();
//	System.out.println("Enter Second String:\n");
//	String b=sc.nextLine();
//	assertTrue(a.checkEmailPassword(aa,b));
//}

@Test(timeout=10000)
public void testtime() throws InterruptedException{
	int i=500;
	TimeUnit.SECONDS.sleep(5000);
	while(i<=10000) {
		System.out.println(i++);
	}
}
}
