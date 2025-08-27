package PatternNumber;
/*  

        *
      * *
    * * *
  * * * *
* * * * *

*/
class Star_Pyramid3
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int a=n; a>=1;a-- )
		{												   
			for (int b=1;b<=n ;b++ )        			   
			{         				
				if (a<=b)
                System.out.print("* ");
				else
				System.out.print("  ");									           
			}
			System.out.println();
		}
	}
}

