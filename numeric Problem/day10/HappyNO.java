import java.util.Scanner;
class HappyNO
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();//49
		int rem=0;
		int sqr=0;
		while ( num>9)
		{
			int sum=0;
			while (num>0)
			{
				rem=num%10;
				sqr=rem*rem;
				sum=sum+sqr;
				num=num/10;
			}
		
			num=sum;
		}
		if (num==1)
		{
			System.out.println("It is happy number");
		}
		else
		{
			System.out.println("It is Not happy number");
		}
	}
}
