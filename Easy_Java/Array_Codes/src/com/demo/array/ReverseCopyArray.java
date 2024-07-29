package com.demo.array;

import java.util.Arrays;

public class ReverseCopyArray 
{

	public static void main(String[] args) 
	{
		int[] A={8,6,10,9,2,15,7,13,14,11};
		int[] B=new int[A.length];
		int i,j;
		for(i=A.length-1, j=0; i>=0;i--,j++) //this condition is important.
		{
			B[j] = A[i];
		}
		System.out.println("Array A :"+ Arrays.toString(A));
		System.out.println("Array B :"+ Arrays.toString(B));
	}

}
