package com.yash.tddexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssignQ4Test {
@Test
public void testArmstrong()
{
AssignQ4 a=new AssignQ4();
assertEquals(true,a.checkArmstrong(153));
}
}
