// Steven Cutting; Test 2; Problem 3; 10/20/2014

/* Write a program that uses two methods: public static printValues(int x, int y)  and public static int largestOf(int a, int b)
* + Your program should should ask the user to enter two integers, 
* + your program should then call printValues()  printValues() should call largestOf() to find the larger of the two values,
* + then printValues() should print the two values and the larger of the two values
*/
import java.util.Scanner;

public class testTwo_ProblemThree {

    public static void main(String[] args) {
        int num1 = getint();
        int num2 = getint();
        printValues(num1, num2);
    }

    public static void printValues(int x, int y) {
        int large = largestOf(x, y);
        System.out.println("Your integers:\n" + x + "\n" + y);
        System.out.println("The larger of the two is: " + large);
    }

    public static int largestOf(int a, int b) {
        if(a > b) return a;
        else return b;
    }

    static int getint() {
            /*Method that asks for an integer and then returns it.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide an integer: ");
        return input.nextInt();
    }
}
