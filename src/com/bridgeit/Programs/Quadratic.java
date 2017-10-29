package com.bridgeit.Programs;

import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import java.util.Scanner;

import com.bridgeit.Utility.Utility;
class Quadratic
{
	public static void main(String[] args)
	{
		    System.out.println("Program Started");
			int a ,b,c;
			Utility utility=new Utility();
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter the value of a:");
			a=sc.nextInt();
			System.out.println("Please Enter the value of b:");
			b=sc.nextInt();
			System.out.println("Please Enter the value of c:");
			c=sc.nextInt();
			utility.quadricEqun(a, b, c);
			System.out.println("Program Ended");
	}
}
