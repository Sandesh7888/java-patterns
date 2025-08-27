package day7;
import java.util.Scanner;
class FactorCount
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int rem=0;
		int count=0;

		for (int a=1; a<num ; a++ )
		{			
			if ( num%a==0)
			{
				count++;
			}
		}
		System.out.println("factor count is : "+count);
		
	}
}
