import java.util.Scanner;
class AbudentNo//12
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int num =sc.nextInt();
		int rem=0;
		int sum=0;

		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
			
		}
		if (sum>num)
		{
			System.out.println("It is Abudent Number");
		}
		else
		{
			System.out.println("It is Not Abudent Number");
		}
		
	}
}
