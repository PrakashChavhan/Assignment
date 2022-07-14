package com.yash.tddexample;

import org.junit.Assert;
import org.junit.Test;



public class AssignmentQ12 {
	@Test
    public void test() {


        AssignQ12 q=new AssignQ12("Prakash","Chavhan");
        AssignQ12 q1=new AssignQ12("Prakash","Chavhan");
        Assert.assertEquals(q, q1);
    }
}
