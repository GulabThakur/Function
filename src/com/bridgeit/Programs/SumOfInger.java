import java.util.Scanner;
class SumOfInger
{
	public static void main(String[] arg)
	{
	 System.out.println("Program Started");
	 System.out.println("Please Enter the size of Array.");
	 Scanner sc1=new Scanner(System.in);
	 int num=sc1.nextInt();
	 int array[] =new int[num];
	 for(int l=0;l<num;l++)
	{
	 array[l]=sc1.nextInt();
	}	
	int count =0;
	int len=0;
	for(int i=0;i<num;i++)
	{  
		
	  for(int j=i+1;j<num-1;j++)
	  { 
 	    for(int k=j+1;k<num-2;k++)
		{
			len++;
		 if(array[i]+array[j]+array[k]==0)
			{
				System.out.println("("+array[i]+" "+array[j]+" "+array[k]+")");
			  count++;
			}
		}
	  }
	}

	if(count>0)
	{
	 System.out.println("Distinct is :"+count);
	}
	else
	{
	 System.out.println("There is no distinct ");
	}
	 System.out.println("Program Ended");	
	}
}
