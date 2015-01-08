// Steven Cutting; Test 2; Problem 2; 10/20/2014

/* Write a program that uses the method public static void countDigits(int x)
* Your program should ask the user for an integer, your program should then count how 
* many digits are in the integer by calling countDigits()  Your program should then print the message:
* "The number xxxx is yyy digits long"  
*The xxxx should be the integer the user entered and the yyy should be how many digits are in the integer.
*/
import java.util.Scanner;

public class testTwo_ProblemTwo {

    public static void main(String[] args) {
        int num = getint();
        countDigits(num);
    }

    public static void countDigits(int x) {
            /* Method that counts how many digits an integer has. */
        int length = String.valueOf(x).length();
        System.out.println("The number " + x + " is " +
                           length + " digits long.");
    }

    static int getint() {
            /*Method that asks for an integer and then returns it.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide an integer: ");
        return input.nextInt();
    }
}
