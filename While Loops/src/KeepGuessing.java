import java.util.Random;
import java.util.Scanner;

public class KeepGuessing
{
	public static void main( String[] args )
	{
		Scanner Keyboard = new Scanner(System.in);
		java.util.Random r = new Random();
		int num, g;
		num = 1 + r.nextInt(10);
		g = Keyboard.nextInt();
		
		System.out.println("I have chosen a number between 1 and 10. Guess.");
		while ( g != num )
		{
			System.out.println("Wrong. Guess again");
			g = Keyboard.nextInt();
		}
		
		System.out.println("That is right");
	}
}
