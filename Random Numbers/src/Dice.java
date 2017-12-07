import java.util.Random;

public class Dice 
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		int num1, num2, total;
		
		num1 = r.nextInt(6);
		num2 = r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println("Roll #1: " + num1);
		System.out.println("Roll #2: " + num2);
		System.out.println("The total is " + (num1 + num2) + "!");
		
	}
}
