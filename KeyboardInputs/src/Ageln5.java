import java.util.Scanner;

public class Ageln5 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age, num;
		String name;
		
		num = 5;
		
		System.out.print("What is your name? ");
		name = keyboard.next();
		System.out.println(name);
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("Did you know that in five years you will be " + ( age + num ) + "years old? and five years ago you were " + (age - 5) + "! Imagine that.");
	}
}
