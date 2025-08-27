import java.util.Scanner;
class MagicNo//1252 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int num =sc.nextInt();
		int rem=0;

		while ( num>9)
		{
			int sum=0;
			while (num>0)
			{
				rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
		
			num=sum;
		}
		if (num==1)
		{
			System.out.println("It is Magic number");
		}
		else
		{
			System.out.println("It is Not Magic number");
		}


		
		
	}
}
