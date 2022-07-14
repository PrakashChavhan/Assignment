package com.yash.tddexample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssignmentQ11 {
	 @Test
	    void test() {
	        Singleton st1= Singleton.getSingleton();
	        Singleton st2= Singleton.getSingleton();

	        assertTrue(AssignQ11.checksingleton(st1, st2));

	        
	    }
}
