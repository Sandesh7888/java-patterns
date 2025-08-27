/*
	  *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*/

class Star_pattern3
{
	public static void main(String[] args) 
	{
		int n=8;
		
		for (int i=1; i<n*2; i++ )
		{												   
			for (int j=1 ; j<n*2 ;j++ )        			   
			{         				
				if (i+j>n && j-i<n  && i-j<n && j+i<n*3 )  
                System.out.print("* ");
				else
				System.out.print("  ");									           
			}
			System.out.println();
		}
	}
}