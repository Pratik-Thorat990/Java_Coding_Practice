package com.demo.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteArrayElement 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		System.out.println("Original Array : "+Arrays.toString(arr));
		int index = 2;
		int[] NewArray= IntStream.range(0, arr.length)
								 .filter(i->i!=index)
								 .map(i->arr[i])
								 .toArray();
		System.out.println("New array after delete element : "+Arrays.toString(NewArray));
		
	}

}
