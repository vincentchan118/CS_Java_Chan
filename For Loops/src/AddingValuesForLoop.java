import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner  keyboard = new Scanner(System.in);
		
		int num, t;
		t = 0;
		System.out.print("Number: ");
		num = keyboard.nextInt();
		
		for (int n = 1; n<=num; n++)
		{
			System.out.print(n + " ");
			t=t+n;
		}
		System.out.println();
		System.out.print("The sum is " + t);
	}
}
