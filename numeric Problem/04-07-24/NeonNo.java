import java.util.Scanner;
class NeonNo//9
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int sqr=num*num;
		int sum=0;
		while (sqr!=0)
		{
			sum=sum+sqr%10;
			sqr=sqr/10;
		}
		if (sum==num)
		{
			System.out.println("It is Neon no");
		}
		else
		{
			System.out.println("Not a Neon no");
		}
	}
}
