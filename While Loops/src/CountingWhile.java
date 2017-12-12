import java.util.Scanner;

public class CountingWhile 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in a message, and I'll display it five times.");
		System.out.print("Message: ");
		String message = keyboard .nextLine();
		
		int n = 0;
		while (n < 5)
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}
	}
}
//a. it adds one to n
//b. Avoiding having to type System.out.println(); over and over again.
//c. It creates a loop that ends itself when an action is completed 5 times.