import java.util.Scanner;
class TechNo//2025
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int num =sc.nextInt();
		int temp=num;
		int count=0;
		int rem=0;
		int sum1=0;
		int sum2=0;
		int sum=0;
		int rev=0;
		

		while (num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;

		if (count%2==0)
		{
			
			for (int i=1;i<=count/2 ;i++ )//20+ 25
			{
				rem=num%10;
				rev=rev*10+rem;
			    num=num/10;
			}
			while (rev>0)//52
			{
				 rem= rev%10;
				sum2 = sum2*10+rem;//25
				rev = rev/10;
			}

			

			sum1=num;
			sum=sum1+sum2;
			sum=sum*sum;
			if (sum==temp)
			{
				System.out.println("it is tech number");	
			}
			else
			{
				System.out.println("it is not tech number");	
			}
		}
		else
		{
		   System.out.println("it is not tech number");	
		}
	}
}
