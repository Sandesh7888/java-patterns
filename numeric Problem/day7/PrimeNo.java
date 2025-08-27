package day7;
import java.util.Scanner;
class PrimeNo
{
	public boolean isPrime(int num){

		int count=0;
		for(int i=0;i<num;i++){
			if(num%i==0){
				count++;
			}			
		}
		return false;
	}






	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int count=0;
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==0)
		{
			System.out.println("Prime num");
		}
		else
		{
			System.out.println("not a Prime num");
		}

		
	}
}
