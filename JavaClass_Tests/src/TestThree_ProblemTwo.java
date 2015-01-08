// Steven Cutting; Test 3; Problem 2; 11/10/2014

/* Coding Problem 2 (35 points) -  
Write a program that asks the user for five integers and stores the integers in an array called nmbrs  int[] nmbrs = new int[5];
your program should then sort the array and then use a for loop to print the numbers in sorted order.
*/

import java.util.Scanner;

public class TestThree_ProblemTwo 
{

    public static void main(String[] args) {
        int[] nmbrs = new int[5];

        nmbrs = userArray(nmbrs);

        int[] sorted_nmbrs = sortArray(nmbrs, nmbrs.length, 0);

        printintarray(sorted_nmbrs);
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
    // -------------------------------------------------------------------------
    public static int[] sortArray(int[] scores, int totalcolumns, int column)
    {/*scores[1] is the index of students, scores[2] are their grades.
         For totalcolumns pass the length of the rows of the hash table.
         For column pass a zero.*/
        if(column  < totalcolumns)
        { 
            int currentMinGrade = scores[column];
            int currentMinIndex = column;

            for(int j = column + 1; j < totalcolumns; j++)
            {
                if(currentMinGrade > scores[j])
                {
                    currentMinGrade = scores[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != column)
            {
                scores[currentMinIndex] = scores[column];  // Grade
                scores[column] = currentMinGrade;
            }
            column++;
            scores = sortArray(scores, totalcolumns, column);
        }
        return scores;
    }

}
