package com.yash.tddexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssignmentQ10 {
	AssignQ10 a=new AssignQ10();
//@Test
//public void ConcateString() {
//	
//	assertEquals("Apple-orange-banana-lemon",a.ConcateStringInArray(new String[] {"Apple", "orange","banana","lemon"}));
//assertEquals(+0,a.mul(0, 5));
//assertEquals(-0,a.mul(0, 5));
	@BeforeClass
	public static void bc() {
		System.out.println("bc work");
	}
	@AfterClass
	public  void ac() {
		System.out.println("ac work");
	}
	@BeforeClass
	public static void Test() {
		assertTrue(false);
	}
}
