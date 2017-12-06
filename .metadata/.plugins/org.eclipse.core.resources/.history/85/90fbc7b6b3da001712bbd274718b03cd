import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("What is your name?" );
		name = keyboard.next();
		System.out.println(name);
		System.out.print("Ok " + name + ", how old are you?");
		age = keyboard.nextInt();
		System.out.println(age);
		
		if (age < 16)
		{
			System.out.println("You can't drive, " + name);
		}
		
		if (age >= 25)
		{
			System.out.println("you can do whatever you want");
		}
		else if (age > 18 && age < 25)
		{
			System.out.println("You can vote but not rent a car");
		}
		else if (age > 16 && age < 18)
		{
			System.out.println("You can drive but not vote.");
		}
	}
}