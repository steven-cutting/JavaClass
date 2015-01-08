
import java.util.Scanner;

public class imputingStuff {

    public static void main(String[] args){
        double[] myList = new double[10];
        double sum = 0;
        double smallest = 1000;
        int smallLocation = 0;
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + myList.length + "  values < 1000: ");

        for(int i = 0; i < myList.length; i++)
        {
            myList[i] = input.nextDouble();
            sum += myList[i];
        }
        
        for(int i = 0; i < myList.length; i++)
        {
        	if(myList[i] < smallest){
        		smallest = myList[i];
        		smallLocation = i;
        	}
        }
        
        for(int i = 0; i < myList.length; i++)
        {
            System.out.print(myList[i] + ",   ");
        }
        
        System.out.println("\n Their sum is " + sum);
        System.out.println("The smallest value is: " + smallest);
        
        myList[smallLocation] *= 2;
        System.out.println("Smallest value has been doubled ot " + myList[smallLocation]);
        
    }

}
