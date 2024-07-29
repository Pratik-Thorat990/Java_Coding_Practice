package com.demo.String;

import java.util.Arrays;

public class ReverseString
{

	public static void main(String[] args) 
	{
		String str = "Hello";
		//Approach - 1
		/*char[] charArray = str.toCharArray();
		for(int i = charArray.length -1 ; i>=0 ; i--)
		{
			System.out.print(charArray[i]);
		}
		System.out.println("");
		*/
		
		//Approach - 2
		/*
		for(int i = str.length()-1; i<=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		*/
		
		//Approach - 3
		/*
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		*/
		
		//Approach - 4
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse());
	}

	

}
