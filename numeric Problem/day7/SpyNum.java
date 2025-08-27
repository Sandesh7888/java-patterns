package day7;
import java.util.Scanner;
class Spy
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int sum=0;
		int multi=1;
		int rem=0;
		while (num>0)
		{
			rem=num%10;
			sum=sum+rem;
			multi=multi*rem;
			num=num/10;
		}

		if (sum==multi)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a Spy number");	
		}


		
	}
}
