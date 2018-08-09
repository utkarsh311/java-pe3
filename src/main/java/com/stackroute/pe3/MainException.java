package com.stackroute.pe3;

public class MainException {
public static String main()throws Exception
{
	try
	{
		int a=10/0;
	}
	catch(Exception e)
	{
	System.out.println(e.toString());	 
	}
	return null;
}
}
