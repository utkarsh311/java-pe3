package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChessBoardTest {
private static ChessBoard obj;
String[][] check= new String[][]{{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
    {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
    {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
    {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
    {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
    {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
    {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
    {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};


@BeforeClass	
public static void setup() {
	obj = new ChessBoard();
}
@AfterClass
public static void teardown() {
	obj = null;
}

	@Test
	public void test() {
		String s[][]=obj.chess();
		assertEquals(check,s);
	}
	

}
