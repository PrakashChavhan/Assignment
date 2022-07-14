package com.yash.tddexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssignmentQ9 {
@Test
public void removeSpecialCharsymbol() {
	AssignQ9 a=new AssignQ9();
	assertEquals("ThisRedcar.",a.removeSpecial("This @Red $car-."));
}
}
