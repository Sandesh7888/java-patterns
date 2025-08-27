package day7;
class P6 
{
	public static void small(int a)
	{
		for(int i=1 ; i<=64 ; i++)
		{
			int b=a*a;
			
			System.out.println("value "+a+"is " + b);
			a=b;
			

		}
		
	}
	public static void main(String[] args) 
	{
		small(2);
	}
}
