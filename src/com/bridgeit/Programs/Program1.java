import java.util.Scanner;
class Program1
{
        static String test="Hello <<username>> ,How are you";
	static String user;
	static String string;
	public static void main(String[] arg)
	{
		System.out.println("Program Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the user Name:");
		user=sc.next();
		sms=test.replace("<<username>>",user);
		System.out.println(string);
		System.out.println("Program Ended");
	}
}
