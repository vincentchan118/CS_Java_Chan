import java.util.Random;
import java.util.Scanner;

public class FlipAgain 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		
		String again;
		
		do
		{
			int flip = rng.nextInt(2);
			String coin;
			
			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";
			System.out.println("You flip a coin and it is... " + coin);
			System.out.print("Would you like to flip again (y/n)?");
			again = keyboard.next();
		} while (again.equals("y"));
		keyboard.close();
	}
}
//a. The do part holds the action that will be completed. The while represents the condition needed before repeating.
//b. Because weather or not the loop is repeated depends on the user's input which is dependent on a previous outcome of the same loop.
//c. The loop will first run and wait to see if it needs to continue.
//b. The while loop checks condition first whereas the do while first completes the loop and checks before continuing.