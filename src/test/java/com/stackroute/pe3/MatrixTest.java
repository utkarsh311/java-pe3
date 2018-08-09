
package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {

	private static MatrixAdd mt;
	@BeforeClass
	public static void setUp() 
	{
		mt=new MatrixAdd();
	}

	@AfterClass
	public static void tearDown() 
	{
		mt=null;
	}

	@Test
	public void test1() 
	{
		int a[][]= {{2,4},{3,5},{1,7}};
		int b[][]= {{9,2},{1,4},{5,3}};
		int[][] r=new int[3][2];
		r=mt.addmat(3, 2, a, b);
		int[][] exp= {{11,6},{4,9},{6,10}};
		assertEquals(exp,r);
	}

	@Test
	public void test2() 
	{
		int a[][]= {{2,4},{3,5},{1,7}};
		int b[][]= {{9,2},{1,4},{5,3}};
		int[][] r=new int[3][2];
		r=mt.addmat(3, 2, a, b);
		int[][] exp= {{11,7},{5,9},{2,10}};
		assertNotEquals(exp,r);
	}
	
	@Test
	public void test3() 
	{
		int a[][]= {{2,-2},{-6,5}};
		int b[][]= {{-5,2},{1,4}};
		int[][] r=new int[2][2];
		r=mt.addmat(2, 2, a, b);
		int[][] exp= {{-3,0},{-5,9}};
		assertEquals(exp,r);
	}
}