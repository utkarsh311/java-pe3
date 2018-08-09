
package com.stackroute.pe3;

public class MatrixAdd 
{
	//int m,n;
	//private int a[][],b[][],c[][];
	public int[][] addmat(int m,int n,int a[][],int b[][])
	{
		int c[][]=new int[m][n];
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < n; k++) 
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
		return c;
	}
}

