
package com.stackroute.pe3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VowelTest {

	private static WordVowel v;
	@BeforeClass
	public static  void setUp() 
	{
		v=new WordVowel();
	}

	@AfterClass
	public static  void tearDown() 
	{
		v=null;
	}

	@Test
	public void test1() 
	{
		String[] str= {"India","United states","Germany","Egypt","czechoslovakia"};
		String[] str1= {"Ind","Untd stts", "Grmny","Egypt","czchslvk"};
		String[] word=v.calvowel(str);		
		assertEquals(str1,word);
	}

}
