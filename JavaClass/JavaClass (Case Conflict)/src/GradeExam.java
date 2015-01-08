
public class GradeExam {

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

        int scores[] = new int[answers.length];

        // Grade all answers
        for (int i = 0; i < answers .length; i++) 
        {
            // Grade one Student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) 
            {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            System.out.println("Student " + i + "'s correct count is " + correctCount);
           
           // save scores
            scores [i] = correctCount;
        }
        // sort scores
        sortArray(scores);

        // print student scores in order
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println("Student " + students[i] + " " + scores[i]);
        }
    }

    public static int[] sortArray(int[] scores)
    {
        int[] students = {0, 1, 2, 3, 4, 5, 6, 7};
        for(int i = 0; i < scores.length; i++)
        
        { 
            int currentMin = scores[i];
            int currentMinIndex = i;

            for(int j = i + 1; j < scores.length; j++)
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

            }
        }
        return students;
    }

}