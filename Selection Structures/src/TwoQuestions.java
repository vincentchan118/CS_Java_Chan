import java.util.Scanner;

public class TwoQuestions 
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String type, size;
		
		System.out.println("1. Is it an animal, vegetable, or mineral? " );
		type = keyboard.next();
		System.out.println("Is it bigger than a breadbox?");
		size = keyboard.next();
		
		if (type.equals("animal") && size.equals("smaller"))
		{
			System.out.println("Is it a squirrel?");
		}
		else if (size.equals("bigger") && type.equals("animal"))
		{
			System.out.println("Is it a moose?");
		}
		
		if (type.equals("vegetable") && size.equals("smaller"))
		{
			System.out.println("Is it a carrot?");
		}
		else if (size.equals("bigger") && type.equals("vegetable"))
		{
			System.out.println("Is it a watermelon?");
		}
		
		if (type.equals("mineral") && size.equals("smaller"))
		{
			System.out.println("Is it a paper clip?");
		}
		else if(size.equals("bigger") && type.equals("mineral"))
		{
			System.out.println("Is it a Camaro?");
		}
	}
}