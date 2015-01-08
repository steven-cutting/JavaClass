
public class Die 
{
    private int sides = 6;
    private String color = "red";
    private int currentvalue = sides;

    Die()
    {
        roll();
    }

    void roll()
    {
        currentvalue = (int)(Math.random()*6) + 1;
    }

    int getValue()
    {
        return currentvalue;
    }
    String getColor()
    {
        return color;
    }
}
