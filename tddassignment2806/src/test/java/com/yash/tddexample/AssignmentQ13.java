package com.yash.tddexample;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AssignmentQ13 {
	 private AssignQ13 obj1;

    @Before
    public void setup() {
        obj1= new AssignQ13();
    }

    @Test
    public void calAdditionTest() {
        int a= -5, b=2;
        int expectedResult=-3;
        long result= obj1.addition(a,b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void calSubstractionTest() {
        int a= -5, b=-2;
        int expectedResult=-3;
        long result= obj1.substraction(a,b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void cal_Multiply_Test() {
        int a= 5, b=0;
        int expectedResult= -0;
        int result= obj1.multiplycal(a,b);
        assertEquals(expectedResult, result);

    }

    @Test
    public void cal_Division_Test() {
        double a= 6, b=2;
        double expectedResult=3;
        double result= obj1.divisioncal(a,b);
        assertEquals(expectedResult, result,0.0000005);
    }

    @Test
    public void TestModulus() {
        int a=5, b=3;
        int expectedResult=2;
        int result= obj1.Modulus(a,b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void Test_power() {
        int a= 6, b=2;
        long expectedResult=36;
        long result= obj1.powerFun(a,b);
        assertEquals(expectedResult, result);
    }

    @Test
    public void cal_squareRoot_Test() {
        double a= 4;
        double expectedResult=2;
        double result= obj1.SquareRoot(a);
        assertEquals(expectedResult, result,0.0000005);
    }

    @Test
    public void cal_cubeRoot_Test() {
        double a= 27;
        double expectedResult=3;
        double result= obj1.cubeRoot(a);
        assertEquals(expectedResult, result,0.000000);
    }

}
