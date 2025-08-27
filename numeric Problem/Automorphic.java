import java.util.Scanner;
class Automorphic
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int squ;
		int rem=1;
		squ= num*num;
		
		rem = squ%10;
		if (num==rem)
		{
			System.out.println(" It is Automorphic Number");
		}
		else
		{
			System.out.println(" It is Not Automorphic Number");
		}

	}

		
	}
