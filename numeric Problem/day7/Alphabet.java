package day7;
class Alphabet
{
	public static void main(String[] args) 
	{
		char Alpha = '1';
		String res = Alpha>= 'a'&& Alpha<='z' || Alpha>= 'A'&& Alpha<='Z'  ? "Alphabet" : "not alphabet"; 
		System.out.println(res);
	}
}
