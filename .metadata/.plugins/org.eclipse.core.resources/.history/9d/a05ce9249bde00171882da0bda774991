import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int num, guess, n;
		num = r.nextInt(100);
		n = 7
		
		System.out.println("Im thinking of a number between 1 and 100. You have 7 guesses.");
		guess = keyboard.nextInt();
		
		if (guess == num)
		{
			System.out.println("That is correct.");
		}
		while ((guess > num) && (n > 0))
		{
			System.out.println("That's too high. I was thinking of " + num + ".");
			n = n-1;
		}
		while ((guess < num) && (n > 0))
		{
			System.out.println("That's too low. I was thinking of " + num + ".");
			n = n-1;
		}
	}
}
