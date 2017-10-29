package com.bridgeit.Programs;

import java.lang.*;
import java.util.Scanner;
class Distance
{
   public static void main(String[] arg)
	{
          System.out.println("Program Started");	
	  int x,y;
          Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the value of X:");
	  x=sc.nextInt();
	  System.out.println("Please enter the value of Y:");
	  y=sc.nextInt();
          Distance.distance(x,y);
          System.out.println("Program Ended");	
	}
   public static void distance(int x,int y)
	{
		double dist;
		double x1=Math.pow(x,2);
		double y1=Math.pow(y,2);
		dist=(x1-y1);
		System.out.println("Distance of "+"("+x+","+y+")"+" is :"+dist);
	}
}
