import java.util.Scanner;


public class AskingQuestions
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.println("What is yur name?");
		name = keyboard.next();
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How much do you weigh?");
		weight = keyboard.nextDouble();
		
		System.out.println("So you're name is " + name + ", you are " + age + " years old,you're " + feet + "'" + inches + "'" + " , and you weigh " + weight + " pounds.");
	}
}

//a. the first line of code imports the scanner class.
//b. the sets the keyboard as the scanner.
//c. the system creates a separate variable for each piece of information. For example line 13 and 14 direct the keyboard input to the name variable.
//d: The error means that the Int is used for intigers and not words.
//e: The difference is that the println moves the the cursor to a new line but the print does not.
