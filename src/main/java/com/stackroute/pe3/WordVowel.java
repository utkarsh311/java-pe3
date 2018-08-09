package com.stackroute.pe3;
import java.util.*;
public class WordVowel 
{
	String[] st;
	public String[] calvowel(String[] st)
	{
		int len=st.length;
		for(int i=0;i<len;i++)
		{
			String s;
			s=st[i].replaceAll("[aeiou]", "");
			st[i]=s;
		}
		return st;
		
	}
}