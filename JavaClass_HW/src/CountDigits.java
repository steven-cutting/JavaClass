// Steven Cutting Lab8 6.7 pg256 CountDigits.java
public class CountDigits {
    public static void main(String[] args)
    {
        int n_values = 100; int min_value = 0; int max_value = 9;
        
        int[] randarray = randomintarray(n_values, min_value, max_value);
        int[][] inventory = inventory_em_ints_n_dat_array(randarray, min_value, max_value);
        System.out.println("--");
        System.out.print("        Numbers:  ");
        printintarray(inventory[1]);
        System.out.print("Times Generated:  ");
        printintarray(inventory[2]);
        System.out.println("--");
    }
    // -------------------------------------------------------------------------
    public static int[] randomintarray(int amount, int min_value, int max_value)
    { /* min-max is inclusive.*/
        int[] randarray = new int[amount];
        int max = 0;

        for(int i = 0; i < amount; i++)
        {
        	randarray[i] = (int) (Math.random() * (max_value + 1)) + min_value;
        	if(randarray[i] > max)
        		max = randarray[i];
        }
        return randarray;
    }
    // -------------------------------------------------------------------------
   public static void printintarray(int[] intarray)
   {
       //System.out.println("");
	   for(int i = 0; i < intarray.length; i++)
        {
   	if(i < intarray.length -1)
   	    prettier_print(intarray[i], ", ");
   	else
   	    prettier_print(intarray[i], "\n");
        }
   }
   public static void prettier_print(int num, String option){
	   if(num < 10)
		   System.out.print(" " + num + option);
	   else
		   System.out.print(num + option);
   }
    // -------------------------------------------------------------------------
    public static int[][] inventory_em_ints_n_dat_array(int[] intarray, int min, int max)
    { 		
        int[][] inventory = new int[max - min + 1][max - min + 1];
        inventory[1] = buildnumberline(min, max);  // Inventory[1] will be the index.
        for(int i = 0; i < intarray.length; i++)
        {
        	inventory[2][intarray[i]] += 1;
        }
        return inventory;
    }
    // -------------------------------------------------------------------------
    public static int[] buildnumberline(int start, int stop)
    { //Builder is inclusive.
        int[] numline = new int[stop + 1];
        for(int i = start; i <= stop; i++)
        {
            numline[i] = i;
        }
        return numline;
    }
}
