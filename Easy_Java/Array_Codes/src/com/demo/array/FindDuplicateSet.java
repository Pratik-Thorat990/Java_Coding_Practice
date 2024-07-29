package com.demo.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateSet
{

	public static void main(String[] args) 
	{
		int[] arr= {1,5,4,5,7,8,9,9,6,5,7};
		Set <Integer> DupNum = new HashSet<>();
		for(Integer num : arr)
		{
			if(!DupNum.add(num))
			{
				System.out.println("Duplicate element : "+num);
			}
		}
	}

}
