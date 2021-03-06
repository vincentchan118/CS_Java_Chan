import java.util.Scanner;

public class BetterCollatz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int n, a, b;
		a = 0;
		b = 0;
		System.out.println("Let's create a COLLAT SEQUENCE");
		System.out.println("Rules:");
		System.out.println("If the number is even, divide it by two.");
		System.out.println("If the number is odd, multiply by 3 and add 1.");
		System.out.println("Repeat this decision until you reach 1.");
		System.out.print("Starting number: ");
		n = keyboard.nextInt();
		System.out.print("[ " + n + " - ");
		do
		{
			if ( (n % 2) == 0 )
			{
				n = (n/2);
				a = a + 1;
				System.out.print(" " + n + " ");
			}
			else
			{
				n = (3 * n) + 1;
				a = a + 1;
				System.out.print(" " + n + " ");
				if (b < n)
				{
					b = n;
				}
			}
			System.out.print("-");
		} while (n > 1);
		System.out.println(" ]");
		System.out.println("Terminated after " + a + " steps.");
		System.out.println("The largest value was " + b);
	}
}
