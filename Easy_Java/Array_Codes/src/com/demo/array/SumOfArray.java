//sum of the element in an array

package com.demo.array;

import java.util.Scanner;
import java.util.Arrays;
public class SumOfArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the element " +i+1+":");
			 arr[i] =sc.nextInt();
		}
		System.out.println("Array"+Arrays.toString(arr));

		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
	
		System.out.println("Sum of array element is : "+ sum); 
	}
}