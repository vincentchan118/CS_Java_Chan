import java.util.Scanner;

public class EnterPIN 
{
	public static void main( String[] args )
	{
		Scanner Keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("WELCOM TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = Keyboard.nextInt();
		
		
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRT AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = Keyboard.nextInt();
		}
		
		System.out.println("/nPIN ACCEPTED. YOU NOW HAVE ACESS TO YOUR ACCOUNT");
	}
}

//a. They both run a section of code when a condition is true.
//b. An If structure only runs when the condition presents itself while a while loop keeps running until the condition is no longer true.
//c. If it was only on the outside, the loop would still be using the old input and retyping it wont work as the loop will only run its own section of code which does not accept inputs.
//d. No as it would no longer accept any pins after the first and just print the two lines over and over again. THis is because the condition is always met. It is called an endless loop.