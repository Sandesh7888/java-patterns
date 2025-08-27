package day7;
import java.util.Scanner;
class FactorAdd
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int rem=0;
		int sum=0;

		for (int a=1; a<num ; a++ )
		{			
			if ( num%a==0)
			{
				sum =sum+a;
			}
		}
		System.out.println("factor Addition is : "+sum);
	}
}
