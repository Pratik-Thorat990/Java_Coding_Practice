package com.demo.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size=scanner.nextInt();
		int array[]= new int[size];
		System.out.println("Enter the element of an array:");
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter element"+(i + 1) + ": ");
			array[i]=scanner.nextInt();
		}
		
		System.out.println("Before Reverse : "+Arrays.toString(array));
		
		reverse(array);
		
		System.out.println("After Reverse : "+Arrays.toString(array));
		
	}
	
	static void reverse(int[] arr)
	{
		int i=0, j=arr.length-1;
		while( i<j)
		{
			int temp= arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			   i++;
			   j--;
		}
		
	}

}
