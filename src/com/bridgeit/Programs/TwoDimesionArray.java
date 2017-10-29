package com.bridgeit.Programs;

import java.util.Scanner;

import com.bridgeit.Utility.Utility;

public class TwoDimesionArray {
   public static void main(String[] args) {
	System.out.println("Program Started");
	Utility un=new Utility();
	int row ,col;
	Scanner scanner =new Scanner(System.in);
	System.out.println("Please Enter the row ");
	row=scanner.nextInt();
	System.out.println("Please Enter the Col ");
	col=scanner.nextInt();
	System.out.println("Please Choose which type data you want to store :\n 1:Intger \n 2:Boolean \n 3:Double \n 4Char");
	int choose=scanner.nextInt();
	System.out.println("Store the data :");
    if(choose==1)
	{ Integer arr[][] =new Integer[row][col];
	   for(int i=0;i<row;i++)
	  {
 	   for(int j=0;j<col;j++)
		{
 		   arr[i][j]=scanner.nextInt();
		}
	   }
	   un.toDArray(arr);
	}
	
    if(choose==2)
	{    Boolean arr[][] =new Boolean[row][col];
	    for(int i=0;i<row;i++)
	         { 
 	         for(int j=0;j<col;j++)
		   {
 		    arr[i][j]=scanner.nextBoolean();
		   }
	         }
	    un.toDArray(arr);
	}
    if(choose==3)
	{ String arr[][] =new  String [row][col];
	   for(int i=0;i<row;i++)
	     {
 	      for(int j=0;j<col;j++)
	 	{
 		   arr[i][j]=scanner.next();
		}
	     }
	
	   un.toDArray(arr);
	}
    if(choose==4)
	{ Character arr[][] =new  Character [row][col];
	  String str=" "; 
	   for(int i=0;i<row;i++)
	     {
 	      for(int j=0;j<col;j++)
	 	{
 		   str=scanner.next();
 		   //arr[i][j]=str.
		}
	     }
	
	   un.toDArray(arr);
	}
	else
		{
			System.out.println("Please choose any one option :");
		}
	System.out.println("Program Ended");
}
}
