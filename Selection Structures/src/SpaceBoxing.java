import java.util.Scanner;

public class SpaceBoxing 
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int weight;
		String planet;
		
		System.out.print("Please enter your earth weight: " );
		weight = keyboard.nextInt();
		System.out.println("I have information for the following planets:");
		System.out.println("1. Venus   2. Mars   3. Jupiter");
		System.out.println("4. Saturn  5. Uraus  6. Neptune");
		planet = keyboard.next();
		
		if(planet.equals("Venus"))
		{
			System.out.println("You would weigh " + (weight * 0.78) + " pounds.");
		}
		if(planet.equals("Mars"))
		{
			System.out.println("You would weigh " + (weight * 0.39) + " pounds.");
		}
		if(planet.equals("Jupiter"))
		{
			System.out.println("You would weigh " + (weight * 2.65) + " pounds.");
		}
		if(planet.equals("Saturn"))
		{
			System.out.println("You would weigh " + (weight * 1.17) + " pounds.");
		}
		if(planet.equals("Uranus"))
		{
			System.out.println("You would weigh " + (weight * 1.05) + " pounds.");
		}
		if(planet.equals("Neptune"))
		{
			System.out.println("You would weigh " + (weight * 1.23) + " pounds.");
		}
	}
}