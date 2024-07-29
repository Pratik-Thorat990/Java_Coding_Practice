package com.demo.array;

import java.util.Scanner;

public class SecMethodReverse
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value one by one in an array");
        for(int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            for( int start=0; start < arr.length-1; start++)
            {
                int end = n-1, temp = 0;
                temp =start;
                start = end;
                end = temp;
                start++;
                end--;
                System.out.println("Revesre Array " + arr[i]);
            }
        }


        
        



    } 
}