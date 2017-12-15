import java.util.Scanner;

public class AreaCalculator 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Area Calculator");
		System.out.println("1: Triangle");
		System.out.println("2: Rectangle");
		System.out.println("3. Square");
		System.out.println("4. Circle");
		System.out.print("Shape is: ");
		int num = keyboard.nextInt();
		if (num == 1)
		{
			System.out.print("What is the length of the base? ");
			int b = keyboard.nextInt();
			System.out.print("What is the length of the height? ");
			int h = keyboard.nextInt();
			System.out.println("The are is " + triangle(b,h));
		}
		if (num == 2)
		{
			System.out.print("What is the length of the length? ");
			int l = keyboard.nextInt();
			System.out.print("What is the length of the width? ");
			int w = keyboard.nextInt();
			System.out.println("The are is " + rectangle(l,w));
		}
		if (num == 3)
		{
			System.out.print("What is the length of the sides? ");
			int s = keyboard.nextInt();
			System.out.println("The are is " + square(s));
		}
		if (num == 4)
		{
			System.out.print("What is the length of the radius? ");
			int r = keyboard.nextInt();
			System.out.println("The are is " + circle(r));
		}
	}
	public static double triangle(int b, int h)
	{
		double area = b*h/2;
		return area;
	}
	public static double square(int s)
	{
		double area = s*s;
		return area;
	}
	public static double rectangle(int l, int w)
	{
		double area = l*w;
		return area;
	}
	public static double circle(int r)
	{
		double area = 3.1415926*r*r;
		return area;
	}
}
