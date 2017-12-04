import java.util.Scanner;

public class DumbCalculator 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int one, two, three;
		
		System.out.print("What is the first number? ");
		one = keyboard.nextInt();
		System.out.println( one);
		System.out.print("What is the second number? ");
		two = keyboard.nextInt();
		System.out.println( two);
		System.out.print("What is the third number? ");
		three = keyboard.nextInt();
		System.out.println( three);
		System.out.print("The average of the three numbers is " + (( one + two + three ) / 3));
		
	}
}
