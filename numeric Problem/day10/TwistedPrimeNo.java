package day10;
import java.util.Scanner;
class TwistedPrimeNo
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int temp =num;
		int count1=0;
		int count2=0;
		int rev=0;
		int rem=0;
		for (int a=2;a<num ;a++ )
		{
			if (num%a==0)
			{
				count1++;
			}
		}
		
		if (count1==0)
		{
			while (num>0)
			{
				rem= num%10;
				rev = rev*10+rem;
				num = num/10;
			}
			

			for (int a=2;a<num ;a++ )
			{
				if (num%a==0)
				{
					count2++;
				}
			}
		}		
		if (count1==count2)
		{
			System.out.println("It is Twisted Prime num");
		}
		else
		{
			System.out.println(" It is not a Twisted Prime num");
		}
	}
}

