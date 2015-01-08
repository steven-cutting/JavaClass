// Steven Cutting Lab9 7.2 pg267 Student Scores in Order
public class GradeExamNSort {

    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = 
        {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        //Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] scores = scoreexam(answers, keys);
        printGrades(scores);

        // sort scores
        int[][] sortedscores = sortArray(scores, scores[2].length, 0);
        printGrades(sortedscores);
    }
    // -------------------------------------------------------------------------
    public static int[][]  scoreexam(char[][] exams, char[] key)
    {
        int numberofstudents = exams.length;
        int numberofquestions = key.length;
        // scores[1] is an index of the students, scores[2] is a list of the scores.
        int scores[][] = new int[numberofstudents][numberofstudents];

        gradeall(scores, exams, key, numberofstudents, numberofquestions, 0);
        return scores;
    }
    // -------------------------------------------------------------------------

    private static int[][] gradeall(int[][] scores, char[][] exams, char[] key, int numberofstudents, int numberofquestions, int student) 
    { /* When calling gradeall pass a zero for student */
        if(student < numberofstudents)
        {
            int correct = gradeone(exams, key, numberofquestions, student, 0, 0);
            scores[1][student] = student;
            scores[2][student] = correct;
            student++;
            scores = gradeall(scores, exams, key, numberofstudents, numberofquestions, student);
        }
        return scores;
    }
    // -------------------------------------------------------------------------
    private static int gradeone(char[][] exams, char[] key, int numberofquestions, int student, int question, int correct) 
    { /* When calling gradeone pass a 0 for question and correct */
        if(question < numberofquestions)
        {
            if (exams[student][question] == key[question])
            {
                correct++;
            }
            question++;
            correct = gradeone(exams, key, numberofquestions, student, question, correct);
        }
        return correct;
    }
    // -------------------------------------------------------------------------
    public static int[][] sortArray(int[][] scores, int totalcolumns, int column)
    {/*scores[1] is the index of students, scores[2] are their grades.
         For totalcolumns pass the length of the rows of the hash table.
         For column pass a zero.*/
        if(column  < totalcolumns)
        { 
            int currentMinGrade = scores[2][column];
            int currentMinStudent = scores[1][column];
            int currentMinIndex = column;

            for(int j = column + 1; j < totalcolumns; j++)
            {
                if(currentMinGrade > scores[2][j])
                {
                    currentMinGrade = scores[2][j];
                    currentMinStudent = scores[1][j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != column)
            {
                scores[2][currentMinIndex] = scores[2][column];  // Grade
                scores[1][currentMinIndex] = scores[1][column];  // Student
                scores[2][column] = currentMinGrade;
                scores[1][column] = currentMinStudent;
            }
            column++;
            scores = sortArray(scores, totalcolumns, column);
        }
        return scores;
    }
    // -------------------------------------------------------------------------
    private static void printGrades(int[][] scores)
    {
        System.out.println("\n--");
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println("Student " + scores[1][i] + " " + scores[2][i]);
        }
        System.out.println("--");
    }
}

