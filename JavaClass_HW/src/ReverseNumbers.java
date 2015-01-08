// Steven Cutting Lab7 6.2 pg255 ReverseNumbers.java

public class ReverseNumbers {
    public static void main(String[] args) {
    	int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	int[] rlist = reverse(list);

    	System.out.println("Original list:");
    	printintarray(list);
    	System.out.println("Reversed:");
    	printintarray(rlist);
	}
   public static int[] reverse(int[] list)
   {
        int[] rlist = new int [list.length];
        int count = 0;
        for(int i = list.length - 1; i >= 0; i--)
        { 
        	rlist[count] = list[i];
        	count++;
        }
        return rlist;
    }
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
}
