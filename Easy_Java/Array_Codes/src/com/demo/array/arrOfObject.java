package com.demo.array;

//Java Java program to illustrate creating
//an array of objects

class Student
{
public int rollno;
public String name;

Student(int rollno, String name)
{
	this.rollno = rollno;
	this.name = name;
}
}

public class arrOfObject
{
public static void main(String[] args)
{
	Student[] arr = new Student[5];
	
	arr[0] = new Student(1, "Sonam");
	arr[1] = new Student(2, "Prem");
	arr[2] = new Student(3, "Pranjali");
	arr[3] = new Student(4, "pratik");
	arr[4] = new Student(5, "Rahul");
	
	for(int i=0 ; i<arr.length ; i++)
	{
		System.out.println("Element at "+i+" : "+arr[i].rollno+"  "+ arr[i].name);
	}
}
}	