package com.demo.String;

public class RemoveSpecialChar
{
	public static void main(String[] args)
	{
		String str = "#j_a$v%#!a*( %s%^t&*a#$$%r^";
		
		String plainstr = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.print(plainstr);
	}
}
