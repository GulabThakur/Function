package com.bridgeit.Programs;

import java.util.Scanner;

import com.bridgeit.Utility.Utility;

import java.lang.*;
class WindChill
{
	public static void main(String [] args)
	{
	  System.out.println("Program Started");
	  Utility utility=new Utility();
	  Scanner sc = new Scanner(System.in);
      System.out.print("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
	  double temp = sc.nextDouble();
	  System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
      double speed = sc.nextDouble();
      utility.windChill(temp, speed);
	  System.out.println("Program Ended");	
	}
}
