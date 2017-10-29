package com.bridgeit.Programs;

import java.lang.Math;
import java.util.Scanner;
import java.util.*;
class CoupenNumber
{
  public static void main(String [] args)
	{
	  System.out.println("Program Started");
	  CoupenNumber cn=new CoupenNumber();
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Please enter the number of coupen :");
	  int n=sc.nextInt();
          System.out.println("...................................");
	  cn.random1(n);
	  System.out.println();
	  System.out.println("Program Ended");
	}
   public void random1(int n)
	{
	   Random r=new Random();
           for(int k=0;k<n;k++)
		{
		  System.out.print(" "+r.nextInt(9999)+" ");
		}
        }
}
