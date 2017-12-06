import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main ( String [] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int feet, inches, pounds;
		double height, weight, BMI;
		
		System.out.println("How many feet tall are you? ");
		feet = keyboard.nextInt();
		System.out.println("How many inches? ");
		inches = keyboard.nextInt();
		System.out.println("How many pounds do you weigh? ");
		pounds = keyboard.nextInt();
		
		height = ((feet + (inches / 12)) * 0.3048);
		weight = (pounds * 0.4536);
		BMI = (weight / ((height) * (height)));
		
		System.out.println("Your BMI is: " + BMI);
		
		if (BMI < 18.5)
		{
			System.out.println("You are underweight.");
		}
		if (24.9 > BMI && BMI > 18.5 || BMI == 24.9 || BMI == 18.5)
		{
			System.out.println("You are normal.");
		}
		if (29.9 > BMI && BMI > 25.0 || BMI == 25.0 || BMI == 29.9)
		{
			System.out.println("You are overweight");
		}
		if (BMI == 30 || BMI > 30)
		{
			System.out.println("You are obese.");
		}
	}
}