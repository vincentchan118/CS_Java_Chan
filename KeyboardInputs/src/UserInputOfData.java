import java.util.Scanner;

public class UserInputOfData 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name1, name2, login;
		int age, phonenumber, ID; 
		double GPA;
		
		System.out.println("Please enter the following information so I can sell it for a profit");
		System.out.println("First Name : ");
		name1 = keyboard.next();
		System.out.println("Last Name : ");
		name2 = keyboard. next();
		System.out.println("Grade : ");
		age = keyboard.nextInt();
		System.out.println("Student ID: ");
		ID = keyboard.nextInt(); 
		System.out.println("Login: ");
		login = keyboard.next();
		System.out.println("GPA: ");
		GPA = keyboard.nextDouble();
		
		System.out.println("Information");
		System.out.println("	Login: " + login);
		System.out.println("	ID: " + ID);
		System.out.println("	Name: " + name2 + ", " + name1);
		System.out.println("	GPA: " + GPA);
		System.out.println("	Grade: " + age);
	}
}
