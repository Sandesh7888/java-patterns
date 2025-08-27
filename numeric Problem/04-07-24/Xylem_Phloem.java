import java.util.Scanner;
class Xylem_Phloem
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number" );
		int num= sc.nextInt();//32346

		if (num>99)
		{
		    int sum1=0,sum2=0;
		    int rem=0;
			rem=num%10;
			sum1=sum1+rem;
			num=num/10;
			while (num>9)
			{
				rem=num%10;
			    sum2=sum2+rem;
			    num=num/10;
			}
			sum1=sum1+num;
			if (sum1==sum2)
			{
				System.out.println("It is Xylem no");
			}
		}
		else
		{
			System.out.println("It is Phloem no");
		}
    }
}