// Steven Cutting Lab 6, pg 212, Listing 5.3, Palindromes

import java.util.Scanner;

public class Listing5_3 {

    public static void main(String[] args) {
        int num = getint();
        if(isPalindrome(num))
        	System.out.println("That was a Palindrome.");
        else
        	System.out.println("That was not a palindrome.");
    }

    public static int reverse(int number){

        int newNumber = 0;
        int length = String.valueOf(number).length();
        for(int x = 0; x < length; x++){
            newNumber = newNumber*10 + number % 10;
            number = number/10;
        }
        return newNumber;
    }
    
    public static boolean isPalindrome(int number) {
    	if(number == reverse(number))
    		return true;
    	else
    		return false;
    }


    static int getint() {
            /*Method that asks for an integer and then returns it.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide a long integer: ");
        return input.nextInt();
    }

}
