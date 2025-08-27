import java.util.Scanner;
class Amicable_FriendlyNO
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no ");
		int num1 =sc.nextInt();
		System.out.println("Enter no");
		int num2 =sc.nextInt();
		int sum1=0;
		int sum2=0;

		
			for (int i=1;num1>i ;i++ )
			{
				if (num1%i==0)
				{
					sum1=sum1+i;
				}
			}
		
		for (int i=1;num2>i ;i++ )
			{
				if (num2%i==0)
				{
					sum2=sum2+i;
				}
			}
		
		if (sum2==num1 && sum1==num2)
		{
			System.out.println("It is Amicable Or Friendly Number");
		}
		else
		{
			System.out.println("It is Not Amicable Or Friendly Number");
		}	
	}
}
