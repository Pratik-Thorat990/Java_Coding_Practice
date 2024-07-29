package com.demo.array;

import java.util.ArrayList;

public class DeleteRandomElementFromArray
{
	public static void main(String[] args)
	{
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		int[] elementToDelete = {4,8,6,7};
		
		int[] NewArray = deleteElement(array, elementToDelete);
		
		for(int element : NewArray)
		{
			System.out.print(element + " ");
		}
	}	
	public static int[] deleteElement(int[] array, int[] elementToDelete)
	{
		//Make a ArrayList 
		ArrayList<Integer> list = new ArrayList<>();
		
		//Add the element in side ArrayList
		for(int i : array)
		{
			list.add(i);
		}
		
		//Remove the element in side the ArrayList through elementToDelete given element
		for(int element : elementToDelete)
		{
			list.remove(Integer.valueOf(element));
		}
		
		//Return the updated array
		int[] NewArray = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
		{
			NewArray[i] = list.get(i);
		}
		
		return NewArray;
	}
	

}
























