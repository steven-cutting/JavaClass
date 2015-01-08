import java.util.Scanner;


public class Subtraction2 
{

	public static void main(String[] args) 
	{
		
		int number = (int) (Math.random()*101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100");
		int r2 = (int)(Math.random() * 5);
		for(int x = r2; x<3; x++)
		{
			System.out.print("\nEnter your guess: ");
			int guess = input.nextInt();
			
			
			
			int r = (int)(Math.random()*2);
				if (r > 0)
					System.out.println("Your guess is high");
				else
					System.out.println("Your guess is low");
		}
		System.out.println("You are not very good at this.");
	}

}
