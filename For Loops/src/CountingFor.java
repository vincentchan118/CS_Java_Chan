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
