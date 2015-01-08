import java.util.Scanner;

public class sentenal_ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int toposint = 0;
		int count = 0;
		
		printGreeting();
		
		int userinput = getInput();
		
		while(userinput > 0)
		{
			toposint += userinput;
			count++;
			userinput = getInput();
			
		
		}
		printResult(toposint, count);
	}
	
	static void printGreeting(){
		System.out.println("Give as many positive integes as you want then." +
					"\nEnter a negative value to recive the sum and average.");
	}
	
	
	
	
	static int getInput(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your pos integer. neg int to quit:");
		int posint = input.nextInt();
		return posint;
	}
	
	
	
	
	static void printResult(int t, int c){
		System.out.println("Sum: " + t);
		if(c>0)
			System.out.println("Avg: " + t/c);
		else
			System.out.println("Word to your mother.");
	}

}
