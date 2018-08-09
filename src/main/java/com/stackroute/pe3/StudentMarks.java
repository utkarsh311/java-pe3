
package com.stackroute.pe3;

public class StudentMarks 
{
	int numOfStudents;
	int[] stuGrades;
	int flag=0;
	public String checkgrade(int[] stuGrades) 
	{
		int len=stuGrades.length;
		for(int i=0;i<len;i++)
		{
		try {
			if(stuGrades[i]>100 || stuGrades[i]<0)
			{
				throw new Exception("Error");
				//flag=1;
				//break;
			}
		//	else
			//	flag=0;
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		}
		return "Passed";
		/*if(flag==1)
		{
			return "Error";
		}
		else
		return "Passed";*/
	}
}

