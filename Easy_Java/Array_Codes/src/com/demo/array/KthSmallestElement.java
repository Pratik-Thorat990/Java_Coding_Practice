package com.demo.array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the element of array :");
		for(int i=0; i<size; i++)
		{
			System.out.println("element"+(i+1)+":");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the kth smallest element you want find : ");
		int k = sc.nextInt();
		int res = KthSmallest(arr,k);
		System.out.println("kth smallest element is "+res);
	}
	
	
	public static int KthSmallest(int[] arr, int k)
	{	
		if(k < 1 || k > arr.length)
		{
			throw new IllegalArgumentException("Invalid k value, k must be between 1 and the length of the array");
		}
		
		return Arrays.stream(arr)
				.sorted()
				.skip(k-1)
				.findFirst()
				.getAsInt();
	}
	
}
