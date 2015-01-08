// Not ready to run
import java.util.Scanner;


    /**
    *Palindrome
    *
    *Get an integer from the user
    *
    *Check to see if it is a palindrome
    *
    *Display the results
    */


    bool result;
    result = isPalindrome(integer);    
    
    System.out.print(number);
    if(result)
        System.out.print(" Is a Palindrome.");
    else
        System.out.print(" Is not a Palindrome.");



public static int reverse(int number){
    /**
    *parse last digit from number
    *add digit to nemNumber
    *remove last digit from number
    *parse last digit from number
    *number = number*10 + digit
    *parse last digit from number
    */

    int newNumber = 0;
    int length = String.valueOf(number).length();
    for(int x = 0; x < length; x++){
        newNumber = newNumber*10 + number % 10
        number = number/10
    }
    return newNumber
}


public static int getNumber(){
    
    System.out.pritntln("Enter a long integer: ");
    Scanner input = new Scanner(System.input);
    //not done

public static boolean isPalindrome(int number) {
    
    int revNumber = 0;
    revNumber = reverse(number);
    
    System.out.print(number);
    if(revNumber == number)
        return TRUE:
    else
        return FALSE;

}






