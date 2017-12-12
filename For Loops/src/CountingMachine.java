import java.util.Scanner;

public class CountingMachine 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		num = keyboard.nextInt();
		for ( int n = 0 ; n!=num+1 ; n = n+1 )
		{
			System.out.print(n + " ");
		}
;	}
}
