package day10;
import java.util.Scanner;
class DisariumNo
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int temp =num;
		int rem=0;
		int rev=0;
		int count=0;
		int multi=1;
		int dis=0;

		while (num>0)
			{
				rem= num%10;
				rev = rev*10+rem;
				num = num/10;
			}
			System.out.println(rev);

		while (rev>0)
		{
			rem=num%10;
			count++; 
			
			System.out.println(multi);

            num=num/10;
		}
		System.out.println(count);


		if (dis==temp)
		{
			System.out.println("It is Disarium Number");
		}
		else{
			System.out.println("It is Not Disarium Number");
		}

		
	}
}
