package com.yash.tddexample;

import java.util.Scanner;

public class AssignQ8 {

	public boolean checkEvenArray(int a[],int b) {
		boolean c=false;
		
		for (int d:a) {
			if (d == b && b % 2 == 0) {
				c=true;

			} 
		}return c;
		
	}

}
