package com.yash.tddexample;


	public class AssignQ13 {


	    public long addition(int a, int b) {
	        return a+b;
	    }

	    public long substraction(int a, int b) {
	        return a-b;
	    }

	    public int multiplycal(int a, int b) {
	        return a*b;
	    }

	    public double divisioncal(double a, double b) {

	        if(a==0 || b==0) {
	            return 0;
	        }
	        return a/b;
	    }

	    public int Modulus(int a, int b) {
	        return (a - b * (a / b));  
	    }

	    public long powerFun(long a, long b) {
	        if (b<0) {

	        }
	        return (long) Math.pow(a, b);
	    }

	    public double SquareRoot(double a) {
	        return Math.sqrt(a);
	    }

	    public double cubeRoot(double a) {
	        double result= Math.cbrt(a);
	        return result;
	    }


	    public static void main(String[] args) {
	        double x=27;
	        double result= Math.cbrt(x);
	        System.out.println(result);
	    }

	
}
