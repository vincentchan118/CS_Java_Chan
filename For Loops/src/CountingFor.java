import java.util.Scanner;

public class CountingFor 
{
	public static void main(String[] args)
	{
		Scanner  keyboard = new Scanner(System.in);
		
		System.out.println("Type a message, and I'll display it five times.");
		System.out.print("Message: ");
		String Message = keyboard.nextLine();
		for (int n = 2 ; n <= 20 ; n = n+3)
		{
			System.out.println(n + ". " + Message );
		}
		
	}
}
//a. The loop runs for 5 times.
//b. The first part defines the variable that is used in the loop, the second is the condition will run for and the last sets the rate of change of the variable.