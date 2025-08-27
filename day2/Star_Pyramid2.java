package PatternNumber;
/*  

* * * * *
* * * *
* * *
* *
*

*/
class Star_Pyramid2
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int a=1; a<=n;a++ )
		{												   
			for (int b=1;b<=n ;b++ )        			   
			{         				
				if (b>=a)
                System.out.print("* ");
				else
				System.out.print("  ");									           
			}
			System.out.println();
		}
	}
}

