// Steven Cutting; Test 3; Problem 3; 11/10/2014

/* Coding Problem 3 (25 points) -
Write a program that creates a matrix (2-dimensional array) double[][] food = new double[][];
with the following data:
05.65 05.65 05.65 05.65 06.52 07.21 06.52 
12.45 12.45 12.45 12.45 14.51 15.64 14.98
14.75 14.75 14.75 14.75.15.83 18.91 17.15
The program should ask the user for a day of the week (an integer between 0 and 6)
and which meal of the day (an integer between 0 and 2). 
The program should then print the food allowance for that day.
*/

import java.util.Scanner;

public class TestThree_ProblemThree {

    public static void main(String[] args) 
    {
        double[][] food =
        {
            {05.65, 05.65, 05.65, 05.65, 06.52, 07.21, 06.52},
            {12.45, 12.45, 12.45, 12.45, 14.51, 15.64, 14.98},
            {14.75, 14.75, 14.75, 14.75, 15.83, 18.91, 17.15},
        };

        int dayofweek = getNum("Please enter a day of the week, an integer 0-6");
        int mealofday = getNum("Please select which meal of the day, an integer 0-2");

        printAllowance(food, dayofweek, mealofday);
    }

    public static int getNum(String message)
   {
        Scanner input = new Scanner(System.in);
        System.out.print(message +": ");
        int num = input.nextInt();
        
        return num;
    }
    public static void printAllowance(double[][] food, int dayofweek, int mealofday){
        System.out.println("Your Allowance: " + food[mealofday][dayofweek]);
    }
}
