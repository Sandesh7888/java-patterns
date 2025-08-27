package day7;
import java.util.Scanner;
class PerfectNo
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;

		for (int a=1; a<num ; a++ )
		{			
			if ( num%a==0)
			{
				sum =sum+a;
			}
		}
		if (sum==temp)
		{
			System.out.println("It is Perfect number");
		}
		else
		{
			System.out.println("It is not perfect number");
		}
		
	}
}
