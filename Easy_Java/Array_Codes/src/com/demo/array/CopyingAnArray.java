package com.demo.array;

import java.util.Arrays;
public class CopyingAnArray
{
	public static void main(String[] args)
	{
		int[] arrA={8,6,10,9,2,15,7,13,14,11};
		int[] arrB=new int[arrA.length];
		for(int i=0; i<arrA.length; i++)
		{
			arrB[i] = arrA[i];
		}
		System.out.println("array of A : "+Arrays.toString(arrA));
		System.out.println("array of A : "+Arrays.toString(arrB));
	}
}
