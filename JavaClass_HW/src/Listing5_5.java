// Steven Cutting Lab 4, pg 212, Listing 5.5, Sort three numbers 

import java.util.Scanner;
import java.util.Arrays;

public class Listing5_5 {

	public static void main(String[] args) {
		// testing displaySortedNumbers method
		
		int num1 = getNum(1);
		int num2 = getNum(2);
		int num3 = getNum(3);
		
		displaySortedNumbers(num1, num2, num3);
		
	}
	
	public static void displaySortedNumbers(
			double num1, double num2, double num3) {
		
		double[] nums = {num1, num2, num3};
		Arrays.sort(nums);
		
		for(double num : nums){
			System.out.print(num + ", ");
		}
		
	}
	
	static int getNum(int i){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Number " + i +": ");
		int num = input.nextInt();
		
		return num;
	}

}
