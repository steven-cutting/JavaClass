// Steven Cutting; Test 3; Problem 1; 11/10/2014

/* Coding Problem 1 (40 points) -
Write a program that asks the user for an five integers and stores the integers in an array called nmbrs  int[] nmbrs = new int[5];
your program should then use a for loop to print the five values on one line.
*/

import java.util.Scanner;

public class TestThree_ProblemOne
{
    public static void main(String[] args)
    {
        int[] nmbrs = new int[5];

        nmbrs = userArray(nmbrs);

        printintarray(nmbrs);

    }
    // -------------------------------------------------------------------------
   public static void printintarray(int[] intarray)
   {
        for(int i = 0; i < intarray.length; i++)
        {
            if(i < intarray.length -1)
                System.out.print(intarray[i] + ", ");
            else
                System.out.println(intarray[i]);
        }
   }
   // -------------------------------------------------------------------------
   public static int getNum(int i)
   {
        Scanner input = new Scanner(System.in);
        System.out.print("Number " + i +": ");
        int num = input.nextInt();
        
        return num;
    }
    // -------------------------------------------------------------------------
    public static int[] userArray(int[] nmbrs)
    {
        for(int i = 0; i < nmbrs.length; i++)
        {
            nmbrs[i] = getNum(i + 1);
        }
        return nmbrs;
    }
}
