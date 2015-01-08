
import java.util.Scanner;

public class Game 
{

    public static void main(String[] args) 
    {
        Cup c = new Cup();
        int score = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome motha' fucka', don't roll a double.");
        System.out.println("Press enter to roll");
        in.nextLine();

        c.roll();

        while(! c.isDouble())
        {
            score++;
            System.out.println("You rolled a total of: " + c.getValue());
            System.out.println("Press enter to roll");
            in.nextLine();
            
            c.roll();
        }
        
        System.out.println("You rolled a double");
        System.out.println("Your final score: " + score);
        
        System.currentTimeMillis();
    }
}
