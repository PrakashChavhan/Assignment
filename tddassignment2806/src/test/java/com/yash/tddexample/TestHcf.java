package com.yash.tddexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHcf {
@Test
public void test_GivenHcf_ShouldReturn_HCFResult_AsInteger() {
	AssignQ1 t=new AssignQ1();
	
	assertEquals(t.HCF(10,2),2);
}
}
