class Ifelse 
{
	public static void main(String[] args)
	{
		int month=20;
	    int year=2013;
		if ( month== 4 || month==6 || month==8 || month==10 || month==12)
		{
			System.out.println("Day in this month 30");
		} else if ( month==3 || month==5 || month==7 || month==9 || month==11)
		{
			System.out.println("Day in this month 31");

		}else if (month==2)
		{
			if (year%4==0)
			{
				System.out.println("Day in this month 28");
			}
			else{
				System.out.println("Day in this month 29");
				
			}
			
		}
		else
			{
			System.out.println("Wrong output ");
		}
	}
}
