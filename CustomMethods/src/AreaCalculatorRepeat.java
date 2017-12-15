import java.util.Scanner;

public class AreaCalculatorRepeat 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Area Calculator");
		System.out.println("1: Triangle");
		System.out.println("2: Rectangle");
		System.out.println("3. Square");
		System.out.println("4. Circle");
		System.out.println("5. Quit");
		System.out.print("Shape is: ");
		int num = keyboard.nextInt();
		do {
			if (num == 1)
			{
				System.out.println("The area is " + triangle());
			}
			if (num == 2)
			{
				
				System.out.println("The area is " + rectangle());
			}
			if (num == 3)
			{
				System.out.println("The are is " + square());
			}
			if (num == 4)
			{
				System.out.println("The are is " + circle());
			}
			System.out.println("Area Calculator");
			System.out.println("1: Triangle");
			System.out.println("2: Rectangle");
			System.out.println("3. Square");
			System.out.println("4. Circle");
			System.out.println("5. Quit");
			System.out.print("Shape is: ");
			num = keyboard.nextInt();
			if (num==5)
			{
				System.out.print("Goodbye!");
			}
		} 
		while (num!=5);
	}
	public static double triangle()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the length of the base? ");
		int b = keyboard.nextInt();
		System.out.print("What is the length of the height? ");
		int h = keyboard.nextInt();
		double area = b*h/2;
		return area;
	}
	public static double square()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the length of the sides? ");
		int s = keyboard.nextInt();
		double area = s*s;
		return area;
	}
	public static double rectangle()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the length of the length? ");
		int l = keyboard.nextInt();
		System.out.print("What is the length of the width? ");
		int w = keyboard.nextInt();
		double area = l*w;
		return area;
	}
	public static double circle()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the length of the radius? ");
		int r = keyboard.nextInt();
		double area = 3.1415926*r*r;
		return area;
	}
}
