package day7;
import java.util.Scanner;
class EvenAddOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int even = 0;
		int odd = 0;

		while (num!=0)//number will zero is equal than it false
		{ 
			int rem =num%10;
			if (rem%2==0)
			{
				even =even+rem; //add in sum of even no
			}
			else
			{
				odd =odd+rem; //add in sum of odd no
			}
			
			
			num = num/10;// remove last number
		}


		System.out.println("even number addition : " + even);
		System.out.println("odd number addition : " + odd);
	}
}
