package day7;
import java.util.Scanner;
class LargestNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();//123
        int rem=0;
		int large=0;
		while (num>0)
		{
			rem=num%10;
			if (rem>large)
			{
				large=rem;
			}
			num=num/10;
			
		}
		System.out.println("large digitis : "+large);
	}
}
