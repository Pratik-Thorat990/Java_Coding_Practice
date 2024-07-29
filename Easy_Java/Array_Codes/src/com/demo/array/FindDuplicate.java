package com.demo.array;

public class FindDuplicate
{
	public static void main(String[] args)
	{
		Integer arr[]= {1,5,8,9,5,4,9,7,8,7,6};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println("Duplicate element :" +arr[i]);
				}
			}
		}

	}

}
