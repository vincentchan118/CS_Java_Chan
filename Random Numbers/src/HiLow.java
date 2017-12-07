import java.util.Random;
import java.util.Scanner;

public class HiLow 
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int num, guess;
		num = r.nextInt(100);
		
		System.out.println("Im thinking of a number between 1 and 100. Guess.");
		guess = keyboard.nextInt();
		
		if (guess == num)
		{
			System.out.println("That is correct.");
		}
		if (guess > num)
		{
			System.out.println("That's too high. I was thinking of " + num + ".");
		}
		if (guess < num)
		{
			System.out.println("That's too low. I was thinking of " + num + ".");
		}
	}
}
