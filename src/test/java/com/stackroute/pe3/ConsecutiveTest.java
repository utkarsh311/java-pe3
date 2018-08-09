package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConsecutiveTest {
	private static Consecutive obj;
	@BeforeClass
	public static void setup() {
		obj = new Consecutive();
	}
	@AfterClass
	public static void teardown() {
		obj = null;
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		boolean s=obj.checkConsecutive("12,13,14,15,16");
		assertEquals(true,s);
	}
	@Test
	public void test1()
	{
		boolean s=obj.checkConsecutive("11,89,47,33,22");
		assertEquals(false,s);
	}
	
}
