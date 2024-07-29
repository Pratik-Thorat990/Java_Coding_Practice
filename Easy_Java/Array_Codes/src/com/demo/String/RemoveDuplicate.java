package com.demo.String;

public class RemoveDuplicate 
{

	public static void main(String[] args)
	{
		String str = "programming";
		//Approach - 1
		StringBuilder sb = new StringBuilder();
		str.chars()
		   .distinct()
		   .forEach(c -> sb.append((char)c));
	}

}
