package com.yash.Que5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumber {
List<Integer> a;



public List<Integer> getA() {
	return a;
}



public void setA(List<Integer> a) {
	this.a = a;
}



public void findMax() {

	int m=a.stream().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println("The Maximum number is:"+m);
}
}
