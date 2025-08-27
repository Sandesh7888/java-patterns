import java.util.Scanner;
class BuzzNo
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int rem;
		
			rem =num%10;
			if (num%7==0 || rem==7)
			{
				System.out.println(" It is buzz Number "+num);
			}
			else
			{
				System.out.println(" It is Not buzz Number "+num);
			}
		
	}
}
