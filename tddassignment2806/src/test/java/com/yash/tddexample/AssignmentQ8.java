package com.yash.tddexample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssignmentQ8 {
@Test
public void checkEvenfromArray() {
	AssignQ8 a=new AssignQ8();
	
	assertTrue(a.checkEvenArray(new int[] {12,2,3,45,6},2));
}

}
