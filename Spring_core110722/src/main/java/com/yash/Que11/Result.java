package com.yash.Que11;

public class Result 
{
	int math;
	int hindi;
	int english;
	int science;
	int total_marks;
	
	public Result(int math, int hindi, int english, int science, int total_marks) {
		super();
		this.math = math;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.total_marks = math + hindi + english + science;
	}
}
