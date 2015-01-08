
public class teststuff 
{

    public static void main(String[] args) 
    {
        Die d1 = new Die();
        System.out.println("Value of one die 1: " + d1.getValue());

        System.out.println("Value of one die 1: " + d1.getValue());
        
        System.out.println("Color of one die 1: " + d1.getColor());

        Cup c = new Cup();
        c.roll();
        System.out.println(c.getValue());
        if(c.isDouble())
            System.out.println("You rolled a Double");
        else
            System.out.println("You did not roll a Double");
    }

}
