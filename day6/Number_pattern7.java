/*
 1 0 1 0
 1 0 1 0
 1 0 1 0
 1 0 1 0
 */
class Number_pattern7
{
	public static void main(String[] args) 
	{
		int n=4;
		int count =1;
		for (int i=1 ; i<=n ; i++ )
		{
			for (int j=1 ; j<=n ; j++ )
			{
				if (count%2==0)
				{
					System.out.print(" "+0);
				}else
				{
				    System.out.print(" "+1);
				}
				
				count++;
			}
			System.out.println(" ");
		}
	}
}
