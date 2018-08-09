package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class EcxpTest {
private static Excp obj;
@BeforeClass
public static void setup() {
	obj = new Excp();
}
@AfterClass
public static void teardown() {
	obj = null;
}
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		int access=8;
		int arr[]= {10,20,30,40};
		String s=obj.testoutofbound(access,arr);
		assertEquals("8",s);
		}
	@Test
	public void test1()
	{
		int size=-6;
		String s=obj.testNeagtiveArray(size);
		assertEquals("null",s);
	}
	@Test
	public void test2()
	{
		int arr[]=null;
		int access=2;
		String s=obj.testNullPointer(access, arr);
		assertEquals("null",s);
	}
}
