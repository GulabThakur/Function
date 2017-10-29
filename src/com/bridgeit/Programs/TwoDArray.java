package com.bridgeit.Programs;

import java.util.Scanner;
import java.lang.*;
class TwoDArray<T>
{  
   
   
  public static void main(String[] args)
	{
     	  System.out.println("Program Started");
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Please Enter the number of rom :");
	  int n ,m;
  	   n=sc.nextInt();
          System.out.println("Please Enter the number of col :");
	   m=sc.nextInt();
	 System.out.println("Please Choose which type data you want to store :\n 1:Intger \n 2:Boolean \n 3:Double");
	 int choose=sc.nextInt();
         
	if(choose==1)
	{ int arr[][] =new int[n][m];
	   for(int i=0;i<n;i++)
	  {
 	   for(int j=0;j<m;j++)
		{
 		   arr[i][j]=sc.nextInt();
		}
	   }
	
	}
	
    if(choose==2)
	{    boolean arr[][] =new boolean[n][m];
	    for(int i=0;i<n;i++)
	         { 
 	         for(int j=0;j<m;j++)
		   {
 		    arr[i][j]=sc.nextBoolean();
		   }
	         }
	}
    if(choose==3)
	{ double arr[][] =new double[n][m];
	   for(int i=0;i<n;i++)
	     {
 	      for(int j=0;j<m;j++)
	 	{
 		   arr[i][j]=sc.nextDouble();
		}
	     }
	

	}
	else
		{
			System.out.println("Please choose any one option :");
		}
         
	  System.out.println("Program Started");
        }
      static <T>void print(T[][] arr ,int n,int m )
	{ 
           for(int k=0;k<n;k++)
		{
		  for(int l=0;l<m;l++)
     		  {
		    System.out.print(arr[k][l]+" ");
		  }
                  System.out.println();
		}	
	}  
}

