package com.bridgeit.Programs;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;
class LeapYear
{
	
	
	public static void main(String [] arg)
	{	
		System.out.println("Program Started");
                Scanner sc1=new Scanner(System.in);
		System.out.println("Please Enter the year you want to check");	
		int year;
		year=sc1.nextInt();
		int length = Integer.valueOf(year).toString().length();
		if(length==4)
		{
		if(year%4==0 && year%100!=0 ||year%400==0)
		{
		 System.out.println("This year is leap year");		
		}
		else
		{
		 System.out.println("This year is not leap year");
		}
		}else
		{
		 System.out.println("Please Enter The year digit 4 number :");
		}
		 
		System.out.println("Program Ended");
	}
}
