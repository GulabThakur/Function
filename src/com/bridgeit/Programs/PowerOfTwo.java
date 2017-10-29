import java.util.Scanner;
class PowerOfTwo
{
	public static void main(String[] args)
	{
	  System.out.println("Program Started");
	  Scanner sc =new Scanner(System.in);
          int num =sc.nextInt();
	  int power=1,result=0;
	  for(int i=1;i<=num;i++)
	  {
  	    power=power*2;
	    System.out.println("Two Power :"+i+" : Result is :"+power);
   	  }
	  result=power;
	  System.out.println("Result is :"+result);
	  System.out.println("Program Ended");	
	}
}
