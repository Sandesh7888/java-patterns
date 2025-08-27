package PatternNumber;
/*  

*           *
* *       * *
* * *   * * *
* * * * * * *

*/


class Star_pyramid1
{
	public static void main(String[] args) 
	{
		int n=4;
		
		for (int i=1; i<=n; i++ )
		{												   
			for (int j=1 ; j<n*2 ;j++ )        			   
			{         				
				if (i>=j || j+i>=n*2)  //1+1<=5 || 1-1>=3
                System.out.print("* ");
				else
				System.out.print("  ");									           
			}
			System.out.println();
		}
	}
}

