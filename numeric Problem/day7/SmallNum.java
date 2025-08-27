package day7;
class SmallNum 
{
	public static void main(String[] args) 
	{
		int a=1,b=34,c=4,d=99;
		int res = a<b&&a<c&&a<d ? a:b<c&&b<d ? b:c<d ? c:d;
		System.out.println(res);
	}
}
