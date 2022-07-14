package com.yash.tddexample;


	class Singleton {

	    public static Singleton st=new Singleton();

	    private Singleton()
	    {

	    }

	    public static Singleton getSingleton()
	    {
	        return st;
	    }
	}

	public class AssignQ11
	{
	    public static boolean checksingleton(Singleton st1,Singleton st2 )
	    {
	        if(st1.hashCode()==st2.hashCode())
	        {
	            return true;
	        }else
	            return false;
	    }
	}

