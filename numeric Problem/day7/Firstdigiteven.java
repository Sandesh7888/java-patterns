package day7;
import java.util.*;
class Firstdigiteven 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		int rem =num/10;
		if (rem%2==0)
		{
			System.out.println( "Last digit even");
		}
		else 
		{
			 System.out.println( "Last digit odd ");
		}
	}
}
