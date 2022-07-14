package com.yash.tddexample;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class AssignmentQ15 {
	@Test
    void test() {
        AssignQ15 i=new AssignQ15(123,"vasu",100,150,LocalDate.of(2020, 11, 23),LocalDate.of(2020, 12, 27));
        assertEquals(true,i.createObject(i));
    }
}
