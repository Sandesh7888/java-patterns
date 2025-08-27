/*
*
* *
*   *
*     *
*   *
* *
*

*/

class StarHolo_pattern9
{
	public static void main(String[] args) 
	{
		int n=8;
		
		for (int i=1; i<n*2; i++ )
		{												   
			for (int j=1 ; j<=n ;j++ )        			   
			{         				
				if ( i==j || j+i==n*2 || j==1)  
                System.out.print("* ");
				else
				System.out.print("  ");									           
			}
			System.out.println();
		}
	}
}