import java.util.Scanner;

public class NameAgeSalary 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age, salary;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi, Sam! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("So you are 29? I guess that's not too old, Sam. How much do you make per hour?");
		salary = keyboard.nextInt();
		
		System.out.println("Wow, " + salary + " is a lot for your age!");
	}
}
