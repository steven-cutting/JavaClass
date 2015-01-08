
public class Cup
{
    String color = "gray";
    String shape = "derp";
    Die d1 = new Die();
    Die d2 = new Die();

    void roll()
    {
        d1.roll();
        d2.roll();

    }

    boolean isDouble()
    {
        if(d1.getValue() == d2.getValue())
            return true;
        else
            return false;
    }
    int getValue()
    {
        return d1.getValue() + d2.getValue();
    }
}
