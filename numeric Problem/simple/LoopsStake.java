//stake 
class Percentage
{
	public static void main(String [] args )
	{
		double bamount = 1 ;
		double incre;
		double p=2.48;
		double temp=0;

		for(int i=1; i<=24; i++)
		{
			incre = bamount*80/100;
			 
			System.out.println(i+" is  "+ bamount +" Profit= "+ incre * p);
			temp = temp+bamount;
			bamount =incre + bamount;
			System.out.println(temp);
			
		}	
	}
}

//0.1    
//0.18   0.2
//0.32   0.36
//0.58   0.64
//1.04   1.16
//1.87   2.08
//3.37   4.11
//6.07   6.66
//10.93   12.1
//19.67   80%
//35.41
//63.74
//114.73
//206.51
//371.72
//669.10
