
/*
* Test next week over Chapters 6 & 7. The test will be 3 coding problems. 
* 2 coding problems will be over single dimensional arrays and 1 coding problem 
* will be over two dimensional arrays. One problem will require sorting the array.
* Tonight the first hour was spent in discussing the Binary Search, the 
* Bubble Sort, and the Selection Sort. Two dimensional arrays (matrices) were 
* introduced. Determining the memory location of a specific cell in an array was 
* discussed. Java is not limited in the number of dimensions of an array.
* Listing 7.2 was entered and run in class using Eclipse. Listing 7.2 was modified
* to include a sort to sort the students scores into ascending order.
*/

/*
* About the assignment.
*
* Homework is to modify 7.2 to include which student scored a particular score 
* when scores are printed in ascending order.
* Listing 7.2 as modified in class. 
* There is a problem with how the code works. Fix the problem. 
* public class GradeExam
*/

{
 public static void main(String args[])
 {
 char[][] answers = 
 {
 {'A','B','A','C','C','D','E','E','A','D'},
 {'D','B','A','B','C','A','E','E','A','D'},
 {'E','D','D','A','C','B','E','E','A','D'},
 {'C','B','A','E','D','C','E','E','A','D'},
 {'A','B','D','C','C','D','E','E','A','D'},
 {'B','B','E','C','C','D','E','E','A','D'},
 {'B','B','A','C','C','D','E','E','A','D'},
 {'E','B','E','C','C','D','E','E','A','D'}
 };
 char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
 int scores[] = new int[answers.length];
 for(int i = 0; i < answers.length; i++) 
 {
 int correctCount = 0;
 for(int j=0; j < answers[i].length; j++) 
 {
 if(answers[i][j] == keys[j])
 correctCount++;
 }
 System.out.println("Student " + i + "'s correct count is " + correctCount);
 scores[i] = correctCount;
 }
 int[] students = sortArray(scores);
 for(int i = 0; i < scores.length; i++)
 {
 System.out.println("Student " + students[i] + " scored " + scores[i]);
 }
 }
public static int[] sortArray(int[] scores)
{
 int[] students = {0,1,2,3,4,5,6,7};
 for(int i = 0; i < scores.length; i++)
 {
 int currentMin = scores[i];
 int currentMinIndex = i;
 for(int j = i+1; j < scores.length; j++)
 {
 if(currentMin > scores[j])
 {
 currentMin = scores[j];
 currentMinIndex = j;
 }
 }
 if(currentMinIndex != i)
 {
 scores[currentMinIndex] = scores[i];
 scores[i] = currentMin;
 students[i] = currentMinIndex;
 students[currentMinIndex] = i;
 }
 }
 return students;
}
} 