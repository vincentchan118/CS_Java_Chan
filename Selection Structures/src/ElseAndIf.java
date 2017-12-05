public class ElseAndIf 
{
	public static void main ( String [] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if ( cars > people )
		{
			System.out.println("We should take the cars.");
		}
		else if ( cars < people )
		{
			System.out.println("We should not take the cars.");
		}
		else
		{
			System.out.println("We can't decide");
		}
		
		if (buses > cars)
		{
			System.out.println("That's too many buses");
		}
		else if ( buses < cars )
		{
			System.out.println("Maybe we should take the buses");
		}
		else
		{
			System.out.println("We still can't decide");
		}
		
		if (people > buses)
		{
			System.out.println("Just take the buses");
		}
		else
		{
			System.out.println("Stay home then");
		}
	}
}

//a: If has an condition for it's prerequisite, else if has a different condition if the first is not met, and else is if none of the conditions are met.'
//b: It would print "We should not take the cars" if there were more cars then people.