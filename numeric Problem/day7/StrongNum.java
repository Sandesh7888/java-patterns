package day7;
import java.util.Scanner;
class StrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int strong=num;
		int sum=0;

		while (num>0)
		{
			int fact =1;
			int rem =num%10;
			for (int i=1;i<=rem ;i++ )
			{
				fact=fact*i;

			}
			sum=sum+fact;
			num=num/10;

		}
		if (sum==strong)
		{
			System.out.println("number is Strong number");
		}
		else
		{
			System.out.println("number is not a Strong number");
		}
	}
}
