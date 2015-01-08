import java.util.Scanner;


public class Subtraction 
{

	public static void main(String[] args) 
	{
		int number = (int) (Math.random()*101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100");
		int guess;
		
		do{
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			if (guess == number)
				System.out.println("Yes" + guess + "is it!");
			else
				if (guess > number)
					System.out.println("Your guess is high");
				else
					System.out.println("Your guess is low");
		}while(guess != number);
	}

}
