package day7;
import java.util.Scanner;
class FirstNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while ( num>9)
		{
			num=num/10;

		}
		System.out.println(num);
	}
}
