public class EvennessMethod 
{
	public static void main( String[] args )
	{
		for (int n = 1 ; n<=100 ; n = n+1)
		{
			System.out.print(n);
			System.out.print(isEven(n));
			System.out.println(isDivBy3(n));
		}
	}
	public static String isEven(int n)
	{
		if (n%2==0)
		{
			return " <";
		}
		else
		{
			return "";
		}
	}
	public static String isDivBy3(int n)
	{
		if (n%3==0)
		{
			return " =";
		}
		else
		{
			return "";
		}
	}
}
