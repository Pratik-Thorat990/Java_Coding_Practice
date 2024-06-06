package com.demo.array;

import java.util.Scanner;

public class FindMinMaxArray
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the element in an array");
		for(int i = 0; i < size ; i++)
		{
			System.out.println("Element "+ (i + 1) +":");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Maximun Element :"+setmaxi(arr,size));
		System.out.println("Minimum Element :"+setmini(arr,size));
		
	}
	
	public static int setmini(int arr[], int size)
	{
		int mini = Integer.MAX_VALUE;
		for(int i = 0; i < size ; i++)
		{
			if(arr[i] < mini)
				mini = arr[i];
		}
		return mini;
	}
	
	public static int setmaxi(int arr[], int size)
	{
		int maxi = Integer.MIN_VALUE;
		for(int i =0 ; i<size ; i++)
		{
			if(arr[i] > maxi)
				maxi = arr[i];
		}
		return maxi;
	}
}
