package com.yash.tddexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssignmentQue2 {

@Test
public void testPalindrome() {
	Assign2 a=new Assign2();
	assertTrue(a.stringPalindrome("abc", "cba"));
}
}
