import java.util.Random;
import java.util.Scanner;

public class KeepGuessingCounter
{
	public static void main( String[] args )
	{
		Scanner Keyboard = new Scanner(System.in);
		java.util.Random r = new Random();
		int num, g, n;
		num = r.nextInt(10);
		g = Keyboard.nextInt();
		n = 0;
		
		System.out.println("I have chosen a number between 1 and 10. Guess.");
		while ( g != num )
		{
			System.out.println("Wrong. Guess again");
			g = Keyboard.nextInt();
			n++;
		}
		
		System.out.println("That is right. It only took you " + n + " tries.");
	}
}
