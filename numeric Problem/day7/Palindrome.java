import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int temp =num;
		int rev=0;
		int rem=0;

		while (num>0)
		{
			 rem= num%10;
            rev = rev*10+rem;
			num = num/10;
		}
		if (temp==num)
		{
			System.out.println("This number is palindrome");
		}
		else
		{
			System.out.println("This number is not palindrome");
		}

		
	}
}
