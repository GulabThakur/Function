package com.bridgeit.Programs;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
class Gambler
{
	public static void main(String[] args)
	{
	 System.out.println("Program Started");
	 int $stake, $Goals, trial;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Please Enter the stake :");
	 $stake=sc.nextInt();
	 System.out.println("Please Enter the Gloals");
	 $Goals= sc.nextInt();
	 System.out.println("Please Enter the trial ");
	 trial=sc.nextInt();
	 int m=trial;
	 int cash=0,win=0,lose=0;
	 double randome;
	 for(int i=1;i<=trial;i++)
	 {
           cash =$stake;
           while(cash >0 && cash <= $Goals && trial>0)
		{ 
			randome=Math.random()*1;
                  if(randome<0.5)
			{
		          cash++;
			 win++;
			}
	           else
			{
			  cash--;
			  lose++;
			}
		  trial--;
		}
	
         }
	 System.out.println("win number : "+win);
    	  System.out.println("lose number "+lose);
        System.out.println("percentage of winning bet :"+(100*win)/m+"%");
        System.out.println("percentage of Losing bet :"+(100*lose)/m+"%");
	  
	   if(cash==$Goals)
		{
		 System.out.println("You are win :");
		}
	    else
		{
		  System.out.println("You are lose :");
		}	
	
	 System.out.println("Program Ended");
	} 
}
