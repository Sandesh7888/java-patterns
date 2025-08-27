import java.util.Scanner;
class Totalnum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int count =0;

		while (num!=0)
		{
			num =num/10; //cut the number
			count++; //count the number is increse

		}


		System.out.println("total no of digit is : "+count);
	}
}
