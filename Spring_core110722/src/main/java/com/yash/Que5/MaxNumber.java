package com.yash.Que5;

import java.util.Arrays;

public class MaxNumber {
int a[];


@Override
public String toString() {
	return "MaxNumber [a=" + Arrays.toString(a) + "]";
}

public int[] getA() {
	return a;
}

public void setA(int[] a) {
	this.a = a;
}
public void findMax() {
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		
		
	}
	
	System.out.println("The Maximum from Array:"+max);
}
}
