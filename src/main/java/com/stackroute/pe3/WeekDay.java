
package com.stackroute.pe3;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class WeekDay 
{
	public ArrayList<String> calDay()
	{
		ArrayList<String> s=new ArrayList<String>();
	Date d=new Date();
	Date d1=new Date(d.getTime()-3*(24*3600*1000));
	//System.out.println(d2);
	String pattern="E dd/MM/yyyy";
	SimpleDateFormat f=new SimpleDateFormat(pattern);
	String s1=f.format(d1);
	System.out.println(s1);
	Date d2=new Date(d.getTime()+3*(24*3600*1000));
	String s2=f.format(d2);
	System.out.println(s2);
	s.add(s1);
	s.add(s2);
	return s;	
	}
}	