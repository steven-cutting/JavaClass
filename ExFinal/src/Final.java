import java.util.Scanner;

public class Final
{
	public static void main(String[] args) 
	{
		/*  Final Exam. Several syntax error and one run-time error 
 			have been inserted in this code. Correct the errors, run 
 			the code, and provide a Snip of the finished code with output//
		*/

		int[] iArray = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five integers");

		for(int x=0; x<5; x++)
		{
			System.out.println("Next integer: ");
			iArray[x]=input.nextInt();
		}

		System.out.print("The numbers you entered are: ");

		for(int x=0; x<5; x++)
		{
			
			System.out.print(iArray[x] + ",  ");
		}
	}
}