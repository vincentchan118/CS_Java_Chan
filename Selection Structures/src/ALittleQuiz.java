import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int a, b, c, d;
		
		d = 0;
		
		System.out.println("What is the capitol of Poland?");
		System.out.println("1. Warsaw");
		System.out.println("2. Pozan");
		a = keyboard.nextInt();
		if (a == 1)
		{
			System.out.println("That's right!");
			d = (d + 1);
		}
		System.out.println("Constantinople was the capitol of which country?");
		System.out.println("1. First Bulgarian Empire");
		System.out.println("2. Ottoman Empire");
		b = keyboard.nextInt();
		if (b == 2)
		{
			System.out.println("That's right");
			d = (d + 1);
		}
		System.out.println("Napoeon was once the Emperor of this country");
		System.out.println("1.Spain");
		System.out.println("2. France");
		c = keyboard.nextInt();
		if (c == 2)
		{
			System.out.println("That is correct");
			d = (d + 1);
		}
		System.out.println("Over all you got " + d + " out of 3 correct.");
	}
}