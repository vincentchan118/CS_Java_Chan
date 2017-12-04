import java.util.Scanner;

public class UserInputOfData 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name1, name2, adress;
		int age, phonenumber;
		
		System.out.println("Please enter the following information so I canseel it for a profit");
		System.out.print("First Name : ");
		name1 = keyboard.next();
		System.out.println(name1);
		System.out.print("Last Name : ");
		name2 = keyboard. next();
		System.out.println(name2);
		System.out.print("Age : ");
		age = keyboard.nextInt();
		System.out.println(age);
		System.out.print("Adress ");
		adress = keyboard.next();
		System.out.println(adress); 
		System.out.print("Phone number");
		phonenumber = keyboard.nextInt();
		System.out.println(phonenumber);
	}
}
