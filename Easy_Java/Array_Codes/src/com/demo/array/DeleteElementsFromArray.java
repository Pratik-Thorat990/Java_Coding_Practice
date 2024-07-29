package com.demo.array;

public class DeleteElementsFromArray 
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = new int[array.length - 3]; // New array with size 3 elements less

        int j = 0; // Index for newArray
        for (int i = 0; i < array.length; i++) 
        {
            if (i < 3 || i > 5)  // Skip indices 3, 4, and 5
            {    newArray[j] = array[i]; // Assign value to new array
                j++; // Increment newArray index
            }
        }

        // Print the new array
        for (int i : newArray)
        {
            System.out.print(i + " ");
        }
    }
}
