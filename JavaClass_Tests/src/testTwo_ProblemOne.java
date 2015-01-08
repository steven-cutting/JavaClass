// Steven Cutting; Test 2; Problem 1; 10/20/2014

/* Coding Problem 1 (40 points) - Write a program that uses the method public static void doubleIt(int x)  
* Your program should ask the user for an integer, your program should then double the integer by calling the doubleIt() method, 
* your program should then print out the original integer and the double of the integer.
*/
import java.util.Scanner;

public class testTwo_ProblemOne {
    public static void main(String[] args) {
        int num = getint();
        System.out.println("Your integer:\n" + num);
        doubleit(num);
    }
    public static void doubleit(int x) {
            /*Method that is passed an int, doubles it and
            * then prints it out with a message.*/
        System.out.println("Your integer doubled:\n" + x*2);
    }
    static int getint() {
            /*Method that asks for an integer and then returns it.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide an integer: ");
        return input.nextInt();
    }
}
