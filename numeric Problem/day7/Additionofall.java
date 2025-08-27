package day7;
import java.util.Scanner;
class Additionofall 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int sum=0;

		while (num!=0)//number will zero is equal than it false
		{
			int rem = num%10; //get last number
			sum =sum+rem; //add in sum
			num = num/10;// remove last number
		}
		System.out.println("sum of all digit : "+sum);
	}
}
