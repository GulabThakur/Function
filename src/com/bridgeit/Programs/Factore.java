package com.bridgeit.Programs;

import java.util.Scanner;
class Factore
{
	public static void main(String[] args)
        {
	  System.out.println("Program Started");
	  System.out.println("Please Enter the number");
	  Scanner sc=new Scanner(System.in);
	  boolean status; 
	  int num=sc.nextInt();
	  Factore fc=new Factore();
	  for(int k=2;k<=num;k++)
	  {
	    status=fc.chechkPrime(k);
	    if(status && num%k==0)
	    {
             System.out.println(k);
	    }
	   
	  } 
	  System.out.println("Program Ended");
        }
	boolean chechkPrime(int num)
	{
	  for(int i=2;i<num;i++)
	  {
     	    if(num%i==0)
		{
		  return false;
		}
          }
         return true;
	} 
}
