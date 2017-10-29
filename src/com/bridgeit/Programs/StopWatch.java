package com.bridgeit.Programs;

import java.lang.*;
class StopWatch
{
    public static void main(String[] args) {
		System.out.println("Program Started");
		double start=System.currentTimeMillis();
		System.out.println(start);
		for(int i=0;i<20;i++) 
		{}
		System.out.println("Stop time ");
		double end=System.currentTimeMillis();
		System.out.println(end);
		double elapse=end-start;
		System.out.println("Time is : "+elapse);
		System.out.println("Program Ended");
	}
}
