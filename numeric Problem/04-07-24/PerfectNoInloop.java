import java.util.Scanner;
class PerfectNoInloop
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int m =sc.nextInt();
		System.out.println("Enter second number");
		int n =sc.nextInt();
		
		int rem=0;
		int sum=0;

		for (int i=m;i<=n ;i++ )
		{
			int temp=i;
			for (int a=1; a<i; a++ )
			{			
				if ( i%a==0)
				{
					sum =sum+a;
				}
			}
			if (sum==temp)
			{
				System.out.println("Perfect number : "+sum);
			}
		}
		
		
		
	}
}
