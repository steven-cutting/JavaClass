// Steven Cutting Final
import java.util.Scanner;
public class Final 
{
 public static void main(String[] args) 
 {
	 /*  Final Exam. Five syntax errors and one run-time error 
 	have been inserted into this code. Correct the errors, run 
 	the code, and provide a Snip of the finished code with 
 	corrected output 1111*/
	 char[] cArray = {'X','X','X','X','X'};
	 String sentence;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter a sentence with at least 5 charcters: ");
	 sentence = input.nextLine();
	 for(int x=0; x<5; x++)
	 	{
		 	cArray[x] = sentence.charAt(x);
	 	}

	 	System.out.print("The first five characters are: ");
	 	for(int x=0; x<4; x++)
	 	{
	 		System.out.print(cArray[x] + ",  ");
	 	}
	 	System.out.print(" and " + cArray[4] + ".");
 }
}