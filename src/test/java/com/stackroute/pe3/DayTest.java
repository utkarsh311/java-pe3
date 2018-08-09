package com.stackroute.pe3;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DayTest {

	private static WeekDay w;
	@BeforeClass
	public static  void setUp() 
	{
		w=new WeekDay();
	}
	
	@AfterClass
	public static void tearDown() 
	{
		w=null;
	}

	@Test
	public void test1() 
	{
		ArrayList<String> r=new ArrayList<String>();
		r.add("Mon 06/08/2018");
		r.add("Sun 12/08/2018");
		ArrayList<String> s=new ArrayList<String>(w.calDay());
		assertEquals(r,s);
	}
	
	public void test2() 
	{
		ArrayList<String> r=new ArrayList<String>();
		r.add("Mon 06/08/2018");
		r.add("Sat 04/08/2018");
		ArrayList<String> s=new ArrayList<String>(w.calDay());
		assertNotEquals(r,s);
	}
	
	/*public void test3() 
	{
		ArrayList<String> r=new ArrayList<String>();
		r.add("sun 05/08/2018");
		r.add("sun 11/08/2018");
		ArrayList<String> s=new ArrayList<String>(w.calDay());
		assertNotEquals(r,s);
	}*/
}