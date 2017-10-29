import java.lang.*;
import java.util.Scanner;
class HarmonicNumber
{
	public  static void main(String[] args)
	{
		System.out.println("Program Started");
		float result =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese Enter the number : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
		  result=result+(float)1/i;
		}
		System.out.println("Result :"+result);
		System.out.println("Program Ended");
	}
}
